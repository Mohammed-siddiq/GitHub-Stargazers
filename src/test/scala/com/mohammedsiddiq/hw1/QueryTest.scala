package com.mohammedsiddiq.hw1

import com.mohammedsiddiq.helpers.singletons.Constants
import com.mohammedsiddiq.service.facadeAndChainPattern.{GenerateQueryResult, ProcessQueryResult, TopRepoFinder}
import org.scalatest.FlatSpec

class QueryTests extends FlatSpec {


  "Query Result " should "generated query and respond valid JSON " in {


    val queryResult: GenerateQueryResult = new TopRepoFinder
    val response = queryResult.queryGithub(Constants.TEST_QUERY)
    assert(response != null)
    assert(response.contains(Constants.MY_EMAIL_ID))
  }


  "Query processor " should "construct repository object from json" in {

    val queryProcessor: ProcessQueryResult = new TopRepoFinder

    val topRepos = queryProcessor.processResult(Constants.TOP_REPO_FINDER_JSON)

    assert(topRepos != Nil)
    assert(topRepos.size == 5)
  }


}
