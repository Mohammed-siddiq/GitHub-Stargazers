package com.mohammedsiddiq.models

/**
  * Models a github repo
  *
  * @param name          repo Name
  * @param description   Repo Description
  * @param forkCount     The number of forks for repo
  * @param starsCount    Number of stars
  * @param issuesCount   Total issues related with the repo
  * @param watchersCount Number of people watching the repo
  * @param pullRequests  Number of pull requests received
  */
class Repository(name: String, description: String, forkCount: Int, starsCount: Int, issuesCount: Int, watchersCount: Int, pullRequests: Int)