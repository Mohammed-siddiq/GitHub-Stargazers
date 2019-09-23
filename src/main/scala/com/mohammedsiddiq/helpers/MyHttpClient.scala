package com.mohammedsiddiq.helpers

import org.apache.http.client.methods.HttpPost
import org.apache.http.entity.{ContentType, StringEntity}
import org.apache.http.impl.client.HttpClientBuilder
import org.apache.http.impl.client.CloseableHttpClient
import org.apache.http.impl.client.HttpClients
import org.apache.http.util.EntityUtils
import org.slf4j.{Logger, LoggerFactory}

/**
  * Http client to query data through github api
  */
class MyHttpClient {


  /**
    * Performs GraphQL Query operation and returns the data from the response if successful
    *
    * @param query The query to post
    * @return The data as string
    */


  val logger: Logger = LoggerFactory.getLogger(this.getClass)


  def queryData(query: String): String = {

    logger.info("Constructing query")

    val httpclient = HttpClients.createDefault

    val httpUriRequest = new HttpPost(ConfigReader.API_URL)

    httpUriRequest.addHeader("Authorization", "bearer " + ConfigReader.API_TOKEN)
    httpUriRequest.addHeader("Accept", ConfigReader.JSON_CONTENT_TYPE)
    val queryPayload = new StringEntity("{\"query\":\"" + query + "\"}", ContentType.APPLICATION_JSON)

    logger.info("Sending payload {}", queryPayload.toString)

    httpUriRequest.setEntity(queryPayload)


    val response = httpclient.execute(httpUriRequest)
    val stringResponse = EntityUtils.toString(response.getEntity, "UTF-8")

    logger.info("Response payload {}", stringResponse)


    response.getEntity match {
      case null => {
        println("Response entity is null")
        null
      }
      case x if x != null => {
        val respJson = x.getContent
        println(respJson)
        respJson.toString
      }
    }

  }


}

