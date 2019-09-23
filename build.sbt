name := "graphql_hw1"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++=Seq("org.slf4j" % "slf4j-api" % "1.7.5",
  "org.slf4j" % "slf4j-simple" % "1.7.5",
  "com.typesafe" % "config" % "1.3.2", "junit" % "junit" % "4.12",
  "com.novocode" % "junit-interface" % "0.11" % Test, "org.apache.httpcomponents" % "httpclient" % "4.5.10")