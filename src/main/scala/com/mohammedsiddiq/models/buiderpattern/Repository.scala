package com.mohammedsiddiq.models.buiderpattern

/**
  * Models a github repo with a builder pattern
  *
  * @param name          repo Name
  * @param description   Repo Description
  * @param forkCount     The number of forks for repo
  * @param starsCount    Number of stars
  * @param issuesCount   Total issues related with the repo
  * @param watchersCount Number of people watching the repo
  * @param pullRequests  Number of pull requests received
  */
case class Repository(
                       name: String
                       = "",
                       description: String = "",

                       url: String = "",

                       forkCount: Int = 0,

                       starsCount: Int = 0,

                       issuesCount: Int = 0,

                       watchersCount: Int = 0,

                       pullRequests: Int = 0,

                       releaseCount: Int = 0,

                       commits: Int = 0,

                       issues: List[Issue] = Nil,

                       pullRequest: List[PullRequest] = Nil,

                       topCommits: List[Comment] = Nil

                     )