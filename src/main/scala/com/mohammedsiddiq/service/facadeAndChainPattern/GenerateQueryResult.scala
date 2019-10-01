package com.mohammedsiddiq.service.facadeAndChainPattern

import com.mohammedsiddiq.helpers.singletons.ConfigReader
import org.apache.http.client.methods.HttpPost
import org.apache.http.entity.{ContentType, StringEntity}
import org.apache.http.impl.client.HttpClients
import org.apache.http.util.EntityUtils
import org.slf4j.LoggerFactory

/**
  * {Design patterns involved : Facade}
  * Hides all the complexity of querying
  *
  */
trait GenerateQueryResult {

  def queryGithub(query: String): String = {
    val logger = LoggerFactory.getLogger(this.getClass)

    val httpclient = HttpClients.createDefault

    val httpUriRequest = new HttpPost(ConfigReader.API_URL)

    httpUriRequest.addHeader("Authorization", "bearer " + ConfigReader.API_TOKEN)
    httpUriRequest.addHeader("Accept", ConfigReader.JSON_CONTENT_TYPE)
    val queryPayload = new StringEntity("{\"query\":\"" + query + "\"}", ContentType.APPLICATION_JSON)

    logger.info("Sending payload {}", queryPayload.toString)

    httpUriRequest.setEntity(queryPayload)


    val response = httpclient.execute(httpUriRequest)


    response.getEntity match {
      case null => {
        logger.info("Response entity is null")
        null
      }
      case x if x != null => {
        val stringResponse = EntityUtils.toString(response.getEntity, "UTF-8")

//        logger.info("Response payload {}", stringResponse)
        stringResponse
      }
    }

  }


}
