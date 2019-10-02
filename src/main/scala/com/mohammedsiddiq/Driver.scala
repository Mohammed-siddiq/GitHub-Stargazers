package com.mohammedsiddiq

import com.mohammedsiddiq.helpers.singletons.{ConfigReader, Constants, TimeTracker}
import com.mohammedsiddiq.service.facadeAndChainPattern.{RepoIssues, RepoPullRequests, TopRepoFinder}
import org.slf4j.{Logger, LoggerFactory}

object Driver extends App {


  val logger: Logger = LoggerFactory.getLogger(this.getClass)

  val topRepoFinder = new TopRepoFinder
  val listOfLanguages = ConfigReader.LANGUAGES

  listOfLanguages.foreach(language => {
    val jsonResponseAndRepos = topRepoFinder.findTopStarredRepos(language)

    val repoIssues = new RepoIssues
    repoIssues.findRepoIssues(language, jsonResponseAndRepos._1)

    val repoPullRequests = new RepoPullRequests
    repoPullRequests.findRepoAttributes(language, jsonResponseAndRepos._1)
    println("*" * Constants.NUMBER_OF_LINES)

    logger.info(s"Total execution time : ${TimeTracker.totalTime / 1000} seconds ")

  })

}
