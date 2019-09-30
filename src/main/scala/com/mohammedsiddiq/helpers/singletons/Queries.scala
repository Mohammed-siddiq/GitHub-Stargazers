package com.mohammedsiddiq.helpers.singletons

object Queries {

  /**
    * Generates GraphQL query to find the top 100 repo details for the a specific language
    *
    * @param language the language
    * @return The query string
    */
  def topRepoFinder(language: String): String = {


    val query = "query{search(query: \\\"language:" + language + " sort:stars\\\", type: REPOSITORY, first: " + ConfigReader.NUMBER_TOP_REPOS + "){repositoryCount edges{node{..." +
      " on Repository{url forkCount name description owner{url ... on User{followers{totalCount}}} releases{totalCount}" +
      " commitComments(last:5){totalCount edges{node{commit{author{name} message status{state} pushedDate} " +
      "author{login avatarUrl url} createdAt bodyText}}} pullRequests(last:5){totalCount edges{node{bodyText createdAt url title state merged author{login avatarUrl url}}}} " +
      "stargazers{totalCount} watchers{totalCount} issues(last:5){totalCount" +
      " edges{node{... on Issue{title body url createdAt author{url resourcePath ... on Actor{url login avatarUrl}}}}}}}}}}}"
    query

  }
}
