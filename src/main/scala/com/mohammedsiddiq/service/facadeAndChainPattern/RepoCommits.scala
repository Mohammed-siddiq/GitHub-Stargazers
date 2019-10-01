package com.mohammedsiddiq.service.facadeAndChainPattern

import java.util.Date

import com.mohammedsiddiq.helpers.singletons.{ConfigReader, Constants}
import com.mohammedsiddiq.models.buiderpattern.{Actor, Issue, Repository}
import play.api.libs.json.{JsArray, JsValue}

import scala.collection.mutable.ListBuffer


/**
  *
  * Finds the top repositories and their latest commits
  * overriding create Repo to delegate the right responsibility
  *
  * {Design Patterns in use : Facade and chain of responsibility}
  */
class RepoCommits extends GenerateQueryResult with ProcessQueryResult {
  /**
    * overriding repo creation for capturing repository attributes
    * Since Repo is built with builder pattern only the required fields can be populated
    *
    * @param jValue The repository JSON node
    * @return the [[Repository]] instance with required attributes
    */

  override def createRepo(jValue: JsValue): Repository = {

    val repoNode = jValue \ "node"

    val issues = (repoNode \ "issues" \ "edges").get.as[JsArray]


    var repoIssues = new ListBuffer[Issue]
    //Populate the issues
    for (issue <- issues.value) {
      val issueNode = issue \ "node"

      val author = Actor(userName = (issueNode \ "login").get.toString(), url = (issueNode \ "url").get.toString(), avatarUrl = (issueNode \ "avatarUrl").get.toString())
      val repIssue = Issue(body = (issueNode \ "body").get.toString(), createdAt = (issueNode \ "createdAt").get.as[Date],
        issueLink = (issueNode \ "url").get.toString(), author = author)

      repoIssues += repIssue

    }

    Repository(name = (repoNode \ "name").get.toString,
      issuesCount = (repoNode \ "issues" \ "totalCount").as[Int],
      pullRequests = (repoNode \ "pullRequests" \ "totalCount").as[Int],
      commits = (repoNode \ "commitComments" \ "totalCount").as[Int],
      url = (repoNode \ "url").get.toString, issues = repoIssues.toList)

  }


  def findRepoAttributes(forLanguageRepos: String, responseJson: String): Unit = {

    val repositories = processResult(responseJson)
    prettyPrintResult(repositories, language = forLanguageRepos)

  }

  override def prettyPrintResult(result: List[Repository], language: String): String = {

    val numberOfLines = Constants.NUMBER_OF_LINES
    println("-" * numberOfLines)
    printf("%100s", s"Latest Issues in $language's top ${ConfigReader.NUMBER_TOP_REPOS} starred repos")
    println()
    println("-" * numberOfLines)
    printf("%-10s|%-30s|%-60s|%-10s|%-10s|%-10s|%-20s|%-10s|%-10s|%-10s", "Sl. No", "Name", "url", "Stars", "Issue", "commits", "pull-requests", "watchers", "stars", "issues")
    println()
    println("-" * numberOfLines)
    var i = 1
    for (repository <- result) {
      printf("%-10d|%-30s|%-60s|%-10d|%-10d|%-10d|%-20d|%-10d|%-10d|%-10d", i, repository.name, repository.url, repository.forkCount
        , repository.releaseCount, repository.commits, repository.pullRequests, repository.watchersCount, repository.starsCount, repository.issuesCount)
      println()
      println("-" * numberOfLines)
      i += 1
    }

    println("#" * numberOfLines)

    ""
  }


}
