package com.mohammedsiddiq.models.buiderpattern

import java.util.Date

/**
  * Models a PR with a builder pattern
  *
  * @param author        The author createing the pull request
  * @param body          PR body
  * @param isMerged      PR state, whether merged or not
  * @param url           The url string
  * @param forRepository the repository for which PR is created
  */
case class PullRequest(author: Actor = null, createdAt: Date = null, isMerged: Boolean = false, url: String="", forRepository: Repository= null, title:String="")
