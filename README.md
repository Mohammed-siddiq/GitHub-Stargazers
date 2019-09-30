# GitHub Languages Stargazer
_A scala project modelling important attributes of Github repositories, using githubs v4 API over graphql_.

Interesting facts, figures and attributes are queried from github for various languages. This utility can be used to get a snapshot of happenings across repositories for a particular language
 
To demonstrate, querying over popular languages like Java, Scala, Python, C and C++. 

For each of the above languages the following metrics are captured : 

- **Top 100 starred repositories with**
    - Repo Name
    - Repo Description
    - Repo URL
    - Total number of Forks
    - Total number of stars
    - Total number of Issues
    - Total number of Watchers
    - Total number of Pull Requests
    - Total releases done
    - Number of Repos
    
- **For each of the above REPOSITORIES, latest bugs/issues are fetched with**
    - Issue details 
    - When was it created 
    - URL
    - The user who created it
- **The latest pull requests with**
    - user creating a pull request
    - summary of the PR
    - status of PR, whether merged or not
    - URL of PR
- **Latest commit comments on the REPOSITORY with**
    - The author of the comment
    - Comment body
    - Date commented
    
## Design patterns in use

- **Facade** : A single facade is exposed to tbe driver program which queries,processes and returns the result
- **Chain of Responsibility** : Decouples the sender of query processor from processing by giving multiple objects(based on the type of query) to handle the processing.
- **Singleton** : Helpers and utils use this pattern since they have no state (or a single global state)
- **Builder** : All the models/Objects use builder pattern for instantiating

_Note:_  _Code which uses these patterns have their package named after the design patterns_

## Steps to Run

- Clone this repo : 

```
git clone https://Iam_MohammedSiddiq@bitbucket.org/Iam_MohammedSiddiq/mohammed_siddiq_474_hw1.git
```            
- Run the following command

```
sbt clean compile run
```


_NOTE : Requires sbt for running the above command_




# Execution snapshot



**Similar response is generated for each of the languages : C, C++, Java, Python, Scala**

The Executed output for each language is stored under `output/` directory.



### Top Starred Repositories



----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                                                              Top 5 starred repos for scala language
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
|Sl. No    |Repo. Name                    |URL                                                         |Forks     |Releases  |Commits   |Pull-Requests       |Watchers  |Stars     |Issues    |
-----------|:-----------------------------|:-----------------------------------------------------------|:--------:|:--------:|:--------:|:------------------:|:--------:|:--------:|---------:|
|1         |"spark"                       |"https://github.com/apache/spark"                           |20139     |0         |1027      |25956               |2123      |23655     |0         |
|2         |"prisma"                      |"https://github.com/prisma/prisma"                          |908       |180       |16        |1593                |93        |15733     |3244      |
|3         |"scala"                       |"https://github.com/scala/scala"                            |2803      |52        |4140      |8381                |819       |12146     |0         |
|4         |"predictionio"                |"https://github.com/apache/predictionio"                    |1982      |1         |16        |413                 |804       |12100     |0         |
|5         |"playframework"               |"https://github.com/playframework/playframework"            |3790      |34        |855       |6411                |749       |11344     |3274      |
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------






### Recent Action in top Repositories : Latest Bugs/Issues





------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                                                        Latest Issues in scala's top 5 starred repos
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                          
|Sl. No    |Repo Name                     |URL                                                         |Total Issues                  |Top 5 Issue                                                                |                         
|----------|:----------------------------:|:----------------------------------------------------------:|:----------------------------:|:--------------------------------------------------------------------------
|1         |"spark"                       |"https://github.com/apache/spark"                           |0                             |
|2         |"prisma"                      |"https://github.com/prisma/prisma"                          |3244                          |
|          |                              |                                                            |                              |Issue Title: "Add MongoDB indexes to non-unique fields"
|          |                              |                                                            |                              |Issue Link: "https://github.com/prisma/prisma/issues/4887"
|          |                              |                                                            |                              |Issue Title: "No documentation to pass in postgres ssl certificate"
|          |                              |                                                            |                              |Issue Link: "https://github.com/prisma/prisma/issues/4888"
|          |                              |                                                            |                              |Issue Title: "Prisma keep deleting my data on Prisma cloud when I tried to update my node's data."
|          |                              |                                                            |                              |Issue Link: "https://github.com/prisma/prisma/issues/4889"
|          |                              |                                                            |                              |Issue Title: "CPU crashing with 8 GB RAM and 2 vCPUs."
|          |                              |                                                            |                              |Issue Link: "https://github.com/prisma/prisma/issues/4892"
|          |                              |                                                            |                              |Issue Title: "Prisma relations fail to work with postgres 9.4"
|          |                              |                                                            |                              |Issue Link: "https://github.com/prisma/prisma/issues/4894"
|3         |"scala"                       |"https://github.com/scala/scala"                            |0                             |
|4         |"predictionio"                |"https://github.com/apache/predictionio"                    |0                             |
|5         |"playframework"               |"https://github.com/playframework/playframework"            |3274                          |
|          |                              |                                                            |                              |Issue Title: "How to Run Lagom on Https "
|          |                              |                                                            |                              |Issue Link: "https://github.com/playframework/playframework/issues/9666"
|          |                              |                                                            |                              |Issue Title: "Fix documentation on AssetsBuilder"
|          |                              |                                                            |                              |Issue Link: "https://github.com/playframework/playframework/issues/9667"
|          |                              |                                                            |                              |Issue Title: "When you cannot match a type in routes file, return 404 rather than 400"
|          |                              |                                                            |                              |Issue Link: "https://github.com/playframework/playframework/issues/9668"
|          |                              |                                                            |                              |Issue Title: "Support for Supplemental Akka HTTP Routes"
|          |                              |                                                            |                              |Issue Link: "https://github.com/playframework/playframework/issues/9669"
|          |                              |                                                            |                              |Issue Title: "Add missing Java Body Parsers"
|          |                              |                                                            |                              |Issue Link: "https://github.com/playframework/playframework/issues/9683"
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------






### Recent Action in top Repositories : Latest Pull Requests






------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                                                Latest Pull Requests in  scala's top 5 starred repos
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
|Sl. No    |Repo Name                     |URL                                                         |Total PRs                     |Latest 5 Prs                                                                |                        
|----------|:----------------------------:|:----------------------------------------------------------:|:----------------------------:|:----------------------------------------------------------------------------
|1         |"spark"                       |"https://github.com/apache/spark"                           |25957                         |
|          |                              |                                                            |                              |PR Title: "add support 'alter table add columns()'"
|          |                              |                                                            |                              |PR Link: "https://github.com/apache/spark/pull/25974"
|          |                              |                                                            |                              |PR Title: "[SPARK-29288][SQL] Spark SQL ADD JAR support HTTP path. "
|          |                              |                                                            |                              |PR Link: "https://github.com/apache/spark/pull/25975"
|          |                              |                                                            |                              |PR Title: "[SPARK-25468][WEBUI] Current page index keep style with dataTable in the spark UI"
|          |                              |                                                            |                              |PR Link: "https://github.com/apache/spark/pull/25976"
|          |                              |                                                            |                              |PR Title: "[SPARK-29268][SQL]isolationOn value is wrong in case of spark.sql.hive.metastore.jars != builtin"
|          |                              |                                                            |                              |PR Link: "https://github.com/apache/spark/pull/25977"
|          |                              |                                                            |                              |PR Title: "[SPARK-29035][BUILD] Update LICENSE and NOTICE for Hive 2.3"
|          |                              |                                                            |                              |PR Link: "https://github.com/apache/spark/pull/25978"
|2         |"prisma"                      |"https://github.com/prisma/prisma"                          |1593                          |
|          |                              |                                                            |                              |PR Title: "Add missing copy ability to code block"
|          |                              |                                                            |                              |PR Link: "https://github.com/prisma/prisma/pull/4880"
|          |                              |                                                            |                              |PR Title: "Typo: Update Class name for deleting many posts"
|          |                              |                                                            |                              |PR Link: "https://github.com/prisma/prisma/pull/4890"
|          |                              |                                                            |                              |PR Title: "Correct typo in documentation"
|          |                              |                                                            |                              |PR Link: "https://github.com/prisma/prisma/pull/4891"
|          |                              |                                                            |                              |PR Title: "Correct typo"
|          |                              |                                                            |                              |PR Link: "https://github.com/prisma/prisma/pull/4893"
|          |                              |                                                            |                              |PR Title: "Pull command returns error"
|          |                              |                                                            |                              |PR Link: "https://github.com/prisma/prisma/pull/4895"
|3         |"scala"                       |"https://github.com/scala/scala"                            |8381                          |
|          |                              |                                                            |                              |PR Title: "Throw IllegalArgumentException for non-existent files in Source.fromResource"
|          |                              |                                                            |                              |PR Link: "https://github.com/scala/scala/pull/8443"
|          |                              |                                                            |                              |PR Title: "Use travis-wait-enhanced"
|          |                              |                                                            |                              |PR Link: "https://github.com/scala/scala/pull/8444"
|          |                              |                                                            |                              |PR Title: "Don't warn about auto-application for nullary methods overriding nilary"
|          |                              |                                                            |                              |PR Link: "https://github.com/scala/scala/pull/8445"
|          |                              |                                                            |                              |PR Title: "2.13 version of Map.hashCode optimizations"
|          |                              |                                                            |                              |PR Link: "https://github.com/scala/scala/pull/8446"
|          |                              |                                                            |                              |PR Title: "Correctly seed root direntry for ZipArchives"
|          |                              |                                                            |                              |PR Link: "https://github.com/scala/scala/pull/8447"
|4         |"predictionio"                |"https://github.com/apache/predictionio"                    |413                           |
|          |                              |                                                            |                              |PR Title: "[PIO-210] Add support for Scala 2.12; Update dependencies"
|          |                              |                                                            |                              |PR Link: "https://github.com/apache/predictionio/pull/518"
|          |                              |                                                            |                              |PR Title: "Update enginevariants.html.md"
|          |                              |                                                            |                              |PR Link: "https://github.com/apache/predictionio/pull/519"
|          |                              |                                                            |                              |PR Title: "PredictionIo-Learning"
|          |                              |                                                            |                              |PR Link: "https://github.com/apache/predictionio/pull/520"
|          |                              |                                                            |                              |PR Title: "[WIP][PIO-209] Upgrade Spark to 2.4 for pre-built binary distribution"
|          |                              |                                                            |                              |PR Link: "https://github.com/apache/predictionio/pull/521"
|          |                              |                                                            |                              |PR Title: "Fix a bug that prevents events with targetEntityType and targetEntity…"
|          |                              |                                                            |                              |PR Link: "https://github.com/apache/predictionio/pull/522"
|5         |"playframework"               |"https://github.com/playframework/playframework"            |6411                          |
|          |                              |                                                            |                              |PR Title: "Update spring-beans, spring-context, ... to 5.1.10.RELEASE"
|          |                              |                                                            |                              |PR Link: "https://github.com/playframework/playframework/pull/9689"
|          |                              |                                                            |                              |PR Title: "Update akka-actor, ... to 2.6.0-M8"
|          |                              |                                                            |                              |PR Link: "https://github.com/playframework/playframework/pull/9690"
|          |                              |                                                            |                              |PR Title: "Update spring-beans, spring-context, ... to 5.2.0.RELEASE"
|          |                              |                                                            |                              |PR Link: "https://github.com/playframework/playframework/pull/9691"
|          |                              |                                                            |                              |PR Title: "Upgrade spring which fixes a bug in DynamicForm"
|          |                              |                                                            |                              |PR Link: "https://github.com/playframework/playframework/pull/9692"
|          |                              |                                                            |                              |PR Title: "Java's field.indexes() wasn't working for DynamicForm"
|          |                              |                                                            |                              |PR Link: "https://github.com/playframework/playframework/pull/9693"

