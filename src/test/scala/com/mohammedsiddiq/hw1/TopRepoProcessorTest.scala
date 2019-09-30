package com.mohammedsiddiq.hw1

import com.mohammedsiddiq.helpers.singletons.Constants
import com.mohammedsiddiq.service.facadeAndChainPattern.{ProcessQueryResult, TopRepoFinder}
import org.scalatest.FlatSpec

class TopRepoProcessorTest extends FlatSpec {


  "Query processor" should "construct repository object from json" in {

////    val queryProcessor: ProcessQueryResult = new ProcessQueryResult {}
//
//    val topRepos = queryProcessor.processResult(Constants.t1)
//
//    val numberOfLines = Constants.NUMBER_OF_LINES
//    println("-" * numberOfLines )
//    printf("%100s","Top 100 starred repos for java language")
//    println()
//    println("-" * numberOfLines )
//    printf("|%-10s|%-30s|%-60s|%-10s|%-10s|%-10s|%-20s|%-10s|%-10s|%-10s|", "Sl. No", "Repo. Name", "URL", "Forks", "Releases", "Commits", "Pull-Requests", "Watchers", "Stars", "Issues")
//    println()
//    println("-" * numberOfLines)
//    var i=1
//    for (repository <- topRepos) {
//      printf("|%-10d|%-30s|%-60s|%-10d|%-10d|%-10d|%-20d|%-10d|%-10d|%-10d|", i, repository.name, repository.url, repository.forkCount
//        , repository.releaseCount, repository.commits, repository.pullRequests, repository.watchersCount, repository.starsCount, repository.issuesCount)
//      println()
////      println("-" * numberOfLines)
//      i+=1
//    }
//
//    assert(topRepos != Nil)
    //    assert(result.size == 5)
  }

}
