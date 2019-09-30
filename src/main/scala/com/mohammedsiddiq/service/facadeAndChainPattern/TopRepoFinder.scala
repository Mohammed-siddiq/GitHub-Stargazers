package com.mohammedsiddiq.service.facadeAndChainPattern

import java.io.{BufferedWriter, File, FileWriter}

import com.mohammedsiddiq.helpers.singletons.{ConfigReader, Constants, Queries}
import com.mohammedsiddiq.models.buiderpattern.Repository

/**
  * {Design patterns involved : Facade and chain of responsibility}
  *
  * Constructs repositories with attributes
  * overriding create Repo to delegate the right responsibility
  */
class TopRepoFinder extends GenerateQueryResult with ProcessQueryResult {


  def findTopStarredRepos(language: String): (String, List[Repository]) = {


    //load query for the language specified
    val query = Queries.topRepoFinder(language.toLowerCase)

    //Querying github
    val responseString = queryGithub(query)

    //Processing the query response and constructing the repository objects
    val topRepos: List[Repository] = processResult(responseString)

    val outputString = prettyPrintResult(topRepos, language)
    persistOutput(outputString, language)
    (responseString, topRepos)
  }

  override def prettyPrintResult(result: List[Repository], language: String): String = {

    val outputString = new StringBuilder

    val numberOfLines = Constants.NUMBER_OF_LINES
    //    println("-" * numberOfLines)

    val divider = "-" * numberOfLines
    println(divider)

    outputString.append(divider + "\n")


    val header = "%100s".format(s"Top ${ConfigReader.NUMBER_TOP_REPOS} starred repos for $language language")

    println(header)
    outputString.append(header + "\n")

    println(divider)
    outputString.append(divider + "\n")

    val hValue = "|%-10s|%-30s|%-60s|%-10s|%-10s|%-10s|%-20s|%-10s|%-10s|%-10s|".format("Sl. No", "Repo. Name", "URL", "Forks", "Releases", "Commits", "Pull-Requests", "Watchers", "Stars", "Issues")
    println(hValue)
    outputString.append(hValue + "\n")
    println(divider)
    outputString.append(divider + "\n")

    var i = 1
    for (repository <- result) {
      val line = "|%-10d|%-30s|%-60s|%-10d|%-10d|%-10d|%-20d|%-10d|%-10d|%-10d|".format(i, repository.name, repository.url, repository.forkCount
        , repository.releaseCount, repository.commits, repository.pullRequests, repository.watchersCount, repository.starsCount, repository.issuesCount)
      println(line)

      outputString.append(line + "\n")
      //      println("-" * numberOfLines)
      i += 1
    }
    println(divider)


    outputString.append(divider + "\n")

    outputString.append("\n\n\n\n")
    outputString.toString()


  }

  override def persistOutput(formattedOutput: String, language: String): Unit = {
    val file = new File(getOutPutFile(language))
    val bw = new BufferedWriter(new FileWriter(file, true))
    bw.write(formattedOutput)
    bw.close()


  }
}
