package com.mohammedsiddiq

import com.mohammedsiddiq.helpers.MyHttpClient

object Driver extends App {

   val httpClient = new MyHttpClient

  val sampleQuery = "{viewer {name repositories(last:3){ nodes { name} }}}"

  httpClient.queryData(sampleQuery)

}
