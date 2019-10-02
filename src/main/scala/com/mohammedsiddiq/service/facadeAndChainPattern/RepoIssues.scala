package com.mohammedsiddiq.service.facadeAndChainPattern

import java.io.{BufferedWriter, File, FileWriter}
import java.util.Date

import com.mohammedsiddiq.helpers.singletons.{ConfigReader, Constants, TimeTracker}
import com.mohammedsiddiq.models.buiderpattern.{Actor, Issue, Repository}
import org.slf4j.{Logger, LoggerFactory}
import play.api.libs.json.{JsArray, JsValue}

import scala.collection.mutable.ListBuffer

/**
  * {Design patterns involved : Facade and chain of responsibility}
  *
  *
  * Constructs repositories with issues and their corresponding details
  * overriding create Repo to delegate the right responsibility
  *
  */
class RepoIssues extends GenerateQueryResult with ProcessQueryResult {


  val logger: Logger = LoggerFactory.getLogger(this.getClass)

  /**
    * overriding repo creation for capturing repository attributes
    * Since Repo is built with builder pattern only the required fields can be populated
    *
    * @param jValue The repository JSON node
    * @return the [[Repository]] instance with required attributes
    */
  override def createRepo(jValue: JsValue): Repository = {

    val repoNode = jValue \ "node"

    val issues = (jValue \ "node" \ "issues" \ "edges").get.as[JsArray]


    var repoIssues = new ListBuffer[Issue]
    //Populate the issues
    for (issue <- issues.value) {
      val issueNode = issue \ "node"

      //      val authorNode = issueNode \ "author"
      //      val author = Actor(userName = (authorNode \ "login").get.toString(), url = (authorNode \ "url").get.toString(), avatarUrl = (authorNode \ "avatarUrl").get.toString())
      val repIssue = Issue(body = (issueNode \ "body").get.toString(), createdAt = (issueNode \ "createdAt").get.as[Date],
        issueLink = (issueNode \ "url").get.toString(), title = (issueNode \ "title").get.toString())

      repoIssues += repIssue

    }

    Repository(name = (repoNode \ "name").get.toString,
      issuesCount = (repoNode \ "issues" \ "totalCount").as[Int],
      pullRequests = (repoNode \ "pullRequests" \ "totalCount").as[Int],
      commits = (repoNode \ "commitComments" \ "totalCount").as[Int],
      url = (repoNode \ "url").get.toString, issues = repoIssues.toList)

  }

  /**
    * Exposed facade that finds the repos with their issues
    *
    * @param forLanguageRepos The language to search for
    * @param responseJson     The response which was already queried
    */

  def findRepoIssues(forLanguageRepos: String, responseJson: String): Unit = {


    val startTime = new Date

    TimeTracker.startTime = startTime.getTime
    logger.info("Stated processing at " + startTime)
    val repositories = processResult(responseJson)


    val endTime = new Date

    TimeTracker.endTime = endTime.getTime

    logger.info("Total time taken for finding repoIssues " + (endTime.getTime - startTime.getTime) + " Milli Seconds ")
    TimeTracker.totalTime += TimeTracker.endTime - TimeTracker.startTime
    val outputString = prettyPrintResult(repositories, language = forLanguageRepos)

    persistOutput(outputString, forLanguageRepos)

  }

  /**
    * pretty print to capture and print the right attributes for the issue
    *
    * @param result   The list of repositories
    * @param language Language whose details were extracted
    * @return formatted string to be persisted
    */
  override def prettyPrintResult(result: List[Repository], language: String): String = {

    val outputFileString = new StringBuilder

    val numberOfLines = Constants.NUMBER_OF_LINES
    val dividingLine = "-" * numberOfLines

    println(dividingLine)
    outputFileString.append(dividingLine + "\n")
    val header = "%100s".format(s"Latest Issues in $language's top ${ConfigReader.NUMBER_TOP_REPOS} starred repos")
    println(header)
    outputFileString.append(header + "\n")

    println(dividingLine)
    outputFileString.append(dividingLine + "\n")


    val headerValue = "%-10s|%-30s|%-60s|%-30s|%-100s".format("Sl. No", "Repo Name", "URL", "Total Issues", "Top 5 Issue")
    println(headerValue)
    outputFileString.append(headerValue + "\n")

    println(dividingLine)

    outputFileString.append(dividingLine + "\n")


    var i = 1
    for (repository <- result) {
      val line = "%-10d|%-30s|%-60s|%-30d|".format(i, repository.name, repository.url, repository.issuesCount)
      println(line)

      outputFileString.append(line + "\n")

      for (rIssue <- repository.issues) {
        var width = 147 + rIssue.title.length
        val line = s"%${width}s".format("|Issue Title: " + rIssue.title)
        println(line)

        outputFileString.append(line + "\n")

        width = 146 + rIssue.issueLink.length

        val l2 = s"%${width}s".format("|Issue Link: " + rIssue.issueLink)
        println(l2)
        outputFileString.append(l2 + "\n")
      }
      println(dividingLine)
      outputFileString.append(dividingLine + "\n")
      i += 1
    }

    outputFileString.append("\n\n\n\n")
    outputFileString.toString
    //    super.prettyPrintResult(result, language)
  }

  /**
    * Stores the formatted output in the specific file
    *
    * @param formattedOutput
    * @param language
    */
  override def persistOutput(formattedOutput: String, language: String): Unit = {
    val file = new File(getOutPutFile(language))
    val bw = new BufferedWriter(new FileWriter(file, true))
    bw.write(formattedOutput)
    bw.close()
  }
}
