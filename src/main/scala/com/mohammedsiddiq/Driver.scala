package com.mohammedsiddiq

import com.mohammedsiddiq.helpers.singletons.{ConfigReader, Constants}
import com.mohammedsiddiq.service.facadeAndChainPattern.{RepoIssues, RepoPullRequests, TopRepoFinder}

object Driver extends App {

  val topRepoFinder = new TopRepoFinder
  val listOfLanguages = ConfigReader.LANGUAGES

  listOfLanguages.foreach(language => {
    val jsonResponseAndRepos = topRepoFinder.findTopStarredRepos(language)

    val repoIssues = new RepoIssues
    repoIssues.findRepoIssues(language, jsonResponseAndRepos._1)

    val repoPullRequests = new RepoPullRequests
    repoPullRequests.findRepoAttributes(language, jsonResponseAndRepos._1)
    println("*" * Constants.NUMBER_OF_LINES)
  })

}
