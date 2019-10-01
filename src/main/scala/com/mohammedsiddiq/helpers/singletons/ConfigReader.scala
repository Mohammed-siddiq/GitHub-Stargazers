package com.mohammedsiddiq.helpers.singletons

import java.util

import com.typesafe.config.{Config, ConfigFactory}

import scala.collection.JavaConversions._
import scala.collection.JavaConverters

/**
  * COnfig reader that reads and provides access to all the configs for the project
  */
object ConfigReader {


  val configReader: Config = ConfigFactory.load()
  val API_TOKEN: String = configReader.getString("API_TOKEN")
  val API_URL: String = configReader.getString("API_URL")
  val JSON_CONTENT_TYPE: String = configReader.getString("JSON_CONTENT_TYPE")
  val LANGUAGES: List[String] = JavaConverters.asScalaBufferConverter(configReader.getStringList("LANGUAGES_TO_STARGAZE")).asScala.toList
  val NUMBER_TOP_REPOS: Int = configReader.getInt("NUMBER_OF_TOP_REPOS")
  //  val TOP_REPO_FINDER_JSON:String = configReader.getString("TOP_REPO_FINDER_JSON")
  val JAVA_OUTPUT_FILE: String = configReader.getString("JAVA_OUTPUT_FILE_NAME")
  val SCALA_OUTPUT_FILE: String = configReader.getString("SCALA_OUTPUT_FILE_NAME")
  val PYTHON_OUTPUT_FILE: String = configReader.getString("PYTHON_OUTPUT_FILE_NAME")
  val C_OUTPUT_FILE: String = configReader.getString("C_OUTPUT_FILE_NAME")
  val CPP_OUTPUT_FILE: String = configReader.getString("CPP_OUTPUT_FILE_NAME")


}
