package com.mohammedsiddiq.service.facadeAndChainPattern

import com.mohammedsiddiq.helpers.singletons.{ConfigReader, Constants}
import com.mohammedsiddiq.models._
import com.mohammedsiddiq.models.buiderpattern.Repository
import org.slf4j.LoggerFactory
import play.api.libs.json._

import scala.collection.mutable.ListBuffer

/**
  *
  * For converting  result string to a valid json and performs any type checking as required
  * based on the task
  *
  * Will be extended and overridden accordingly for the tasks
  */
trait ProcessQueryResult {

  /**
    * Parses the JSON response and serializes the response to the list of [[Repository]]
    *
    * @param queryResult the JSON response String
    * @return list of [[Repository]]
    */
  def processResult(queryResult: String): List[Repository] = {

    val logger = LoggerFactory.getLogger(this.getClass)

//    logger.info("Processing result ", queryResult)
    //Parse the json string to json object
    val responseJson = Json.parse(queryResult)

    //    implicit val reads : Reads[Repository] = (
    //      (JsPath\"ax").read[String]
    //      )()

    logger.info("Extracting repository notes..")
    //Extract all the repository nodes
    val repoNodes = (responseJson \ "data" \ "search" \ "edges").get.as[JsArray]
    val topRepositories = new ListBuffer[Repository]


    logger.info("Constructing repository objects..")

    for (repoNode <- repoNodes.value) {

      topRepositories += createRepo(repoNode)

    }

    topRepositories.toList
  }

  /**
    * Creates repo given the JSon string
    *
    * @param jValue the json node in response
    * @return List of repos
    */
  def createRepo(jValue: JsValue): Repository = {

    val value = jValue \ "node"
    Repository(name = (value \ "name").get.toString, description = (value \ "description").get.toString, forkCount = (value \ "forkCount").as[Int],
      starsCount = (value \ "stargazers" \ "totalCount").as[Int],
      issuesCount = (value \ "issues" \ "totalCount").as[Int],
      watchersCount = (value \ "watchers" \ "totalCount").as[Int],
      pullRequests = (value \ "pullRequests" \ "totalCount").as[Int],
      releaseCount = (value \ "releases" \ "totalCount").as[Int],
      commits = (value \ "commitComments" \ "totalCount").as[Int],
      url = (value \ "url").get.toString)
  }

  /**
    * To print the fromatted output
    *
    * @param result   The list of repos
    * @param language The language queried for
    * @return formatted output string
    */

  def prettyPrintResult(result: List[Repository], language: String): String

  /**
    * Persists in right output file accordingly
    *
    * @param formattedOutput The formatted output to persists
    * @param language        The language querying for
    */
  def persistOutput(formattedOutput: String, language: String): Unit = {}

  def getOutPutFile(language: String): String = {

    language.toLowerCase match {
      case Constants.JAVA_LANGUAGE => ConfigReader.JAVA_OUTPUT_FILE;
      case Constants.SCALA_LANGUAGE => ConfigReader.SCALA_OUTPUT_FILE;
      case Constants.C_LANGUAGE => ConfigReader.C_OUTPUT_FILE;
      case Constants.CPP_LANGUAGE => ConfigReader.CPP_OUTPUT_FILE;
      case Constants.PYTHON_LANGUAGE => ConfigReader.PYTHON_OUTPUT_FILE;
    }

  }

}
