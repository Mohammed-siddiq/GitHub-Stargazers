package com.mohammedsiddiq.helpers

import com.typesafe.config.{Config, ConfigFactory}

object ConfigReader {

  val configReader: Config = ConfigFactory.load()
  val API_TOKEN: String = configReader.getString("API_TOKEN")
  val API_URL: String = configReader.getString("API_URL")

  val JSON_CONTENT_TYPE:String = configReader.getString("JSON_CONTENT_TYPE")


}
