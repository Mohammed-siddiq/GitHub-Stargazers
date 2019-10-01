package com.mohammedsiddiq.service.facadeAndChainPattern

import java.io.{BufferedWriter, File, FileWriter}
import java.util.Date

import com.mohammedsiddiq.helpers.singletons.{ConfigReader, Constants}
import com.mohammedsiddiq.models.buiderpattern.{Actor, Issue, PullRequest, Repository}
import play.api.libs.json.{JsArray, JsValue, Json}

import scala.collection.mutable.ListBuffer

/**
  * Extracts the Repositories and their latest pull requests with PR details
  *
  * {Patterns in use : Facade and chain of responsibility}
  */
class RepoPullRequests extends GenerateQueryResult with ProcessQueryResult {

  /**
    * overriding repo creation for capturing repository attributes
    * Since Repo is built with builder pattern only the required fields can be populated
    *
    * @param jValue The repository JSON node
    * @return the [[Repository]] instance with required attributes
    */
  override def createRepo(jValue: JsValue): Repository = {

    val repoNode = jValue \ "node"

    val pullReqs = (repoNode \ "pullRequests" \ "edges").get.as[JsArray]


    var repoPrs = new ListBuffer[PullRequest]
    //Populate the issues
    for (pr <- pullReqs.value) {
      val prNode = pr \ "node"

      //      val authorNode = Option(prNode \ "author")
      val repPr = PullRequest(title = (prNode \ "title").get.toString(), isMerged = (prNode \ "merged").as[Boolean], createdAt = (prNode \ "createdAt").as[Date], url = (prNode \ "url").get.toString())

      repoPrs += repPr

    }

    Repository(name = (repoNode \ "name").get.toString,
      issuesCount = (repoNode \ "issues" \ "totalCount").as[Int],
      pullRequests = (repoNode \ "pullRequests" \ "totalCount").as[Int],
      commits = (repoNode \ "commitComments" \ "totalCount").as[Int],
      url = (repoNode \ "url").get.toString, pullRequest = repoPrs.toList)

  }

  /**
    * Facade exposed to capture the PRS
    *
    * @param forLanguageRepos The language to find PRs
    * @param responseJson     The response which was already queried
    */
  def findRepoAttributes(forLanguageRepos: String, responseJson: String): Unit = {

    val repositories = processResult(responseJson)
    val outputString = prettyPrintResult(repositories, language = forLanguageRepos)
    persistOutput(outputString, forLanguageRepos)

  }

  /**
    * pretty print to capture and print the right attributes for the PR
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

    val headString = "%100s".format(s"Latest Pull Requests in  $language's top ${ConfigReader.NUMBER_TOP_REPOS} starred repos")

    //    printf("%100s", s"Latest Pull Requests in in $language's top ${ConfigReader.NUMBER_TOP_REPOS} starred repos")
    outputFileString.append(headString + "\n")
    println(headString)

    println(dividingLine)
    outputFileString.append(dividingLine + "\n")

    var headValue = "%-10s|%-30s|%-60s|%-30s|%-100s".format("Sl. No", "Repo Name", "URL", "Total PRs", "Latest 5 Prs")
    println(headValue)
    outputFileString.append(headValue + "\n")

    println(dividingLine)
    outputFileString.append(dividingLine + "\n")

    var i = 1
    for (repository <- result) {
      val individualRepo = "%-10d|%-30s|%-60s|%-30d|".format(i, repository.name, repository.url, repository.pullRequests)
      //      printf("%-10d|%-30s|%-60s|%-30d|", i, repository.name, repository.url, repository.pullRequests)
      println(individualRepo)
      outputFileString.append(individualRepo + "\n")
      for (pr <- repository.pullRequest) {
        var width = 144 + pr.title.length
        //        printf(s"%${width}s", "|PR Title: " + pr.title)
        val line = s"%${width}s".format("|PR Title: " + pr.title)
        println(line)
        outputFileString.append(line + "\n")


        width = 143 + pr.url.length
        val xLine = s"%${width}s".format("|PR Link: " + pr.url)
        println(xLine)
        outputFileString.append(xLine + "\n")
      }
      println(dividingLine)
      outputFileString.append(dividingLine + "\n")
      i += 1
    }
    outputFileString.append("\n\n\n\n")
    outputFileString.toString
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
