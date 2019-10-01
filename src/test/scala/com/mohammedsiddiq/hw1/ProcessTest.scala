package com.mohammedsiddiq.hw1

import com.mohammedsiddiq.helpers.singletons.Constants
import com.mohammedsiddiq.models.buiderpattern.Repository
import com.mohammedsiddiq.service.facadeAndChainPattern.{ProcessQueryResult, TopRepoFinder}
import org.scalatest.FlatSpec
import play.api.libs.json.Json

class ProcessTest extends FlatSpec {

  /**
    * Testing the JSON processing
    */

  "Constructed repo " should " be a valid not null repository" in {

    val processor: ProcessQueryResult = new TopRepoFinder

    val response = processor.createRepo(Json.parse(Constants.CREATE_REPO_TEST_QUERY))


    assert(response != null)
    assert(response.isInstanceOf[Repository])

  }

  /**
    * Testing th Repository object construction
    */
  "Created Repo" should " have extracted right values form json" in {
    val processor: ProcessQueryResult = new TopRepoFinder

    val repository = processor.createRepo(Json.parse(Constants.CREATE_REPO_TEST_QUERY))

    println(repository.name)
    //    assert(repository.name.equals("\"elasticsearch\""))
    assert(repository.issuesCount == 21157)
    assert(repository.pullRequests == 25788)
  }


}
