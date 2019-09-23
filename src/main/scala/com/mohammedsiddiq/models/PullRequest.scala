package com.mohammedsiddiq.models

/**
  * Models a PR
  * @param author The author createing the pull request
  * @param body PR body
  * @param isMerged PR state, whether merged or not
  * @param url The url string
  * @param forRepository the repository for which PR is created
  */
class PullRequest(author: Actor, body: String, isMerged: Boolean, url: String, forRepository: Repository)