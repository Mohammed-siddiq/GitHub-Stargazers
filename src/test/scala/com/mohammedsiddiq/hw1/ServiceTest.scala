package com.mohammedsiddiq.hw1

import com.mohammedsiddiq.helpers.singletons.Constants
import com.mohammedsiddiq.service.facadeAndChainPattern.{ProcessQueryResult, RepoIssues, TopRepoFinder}
import org.scalatest.FlatSpec
import play.api.libs.json.Json

class ServiceTest extends FlatSpec {


  "Repo Finder" should "construct repository object from json" in {

    val queryProcessor: ProcessQueryResult = new TopRepoFinder

    val topRepos = queryProcessor.processResult(Constants.TOP_REPO_FINDER_JSON)

    assert(topRepos != Nil)
    assert(topRepos.size == 5)
  }


  "Create Repo for Issues" should " have overriden the behavior adding issues" in {

    val repoIssues = new RepoIssues

    val response = repoIssues.createRepo(Json.parse(Constants.ISSUE_NODE))

    assert(response != null)
    assert(response.issues.length == 2)


  }


  "Issues constructed from json" should " have correct attributes" in {


    val repoIssues = new RepoIssues

    val response = repoIssues.createRepo(Json.parse(Constants.ISSUE_NODE))

    assert(response != null)
    assert(response.issues.length == 2)
    assert(response.issues.head.title.equals("\"剑值offer跳台阶迭代解法时result的初始值\""))
    assert(response.issues.head.issueLink.equals("\"https://github.com/CyC2018/CS-Notes/issues/795\""))

  }
}
