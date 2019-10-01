package com.mohammedsiddiq.helpers.singletons

/**
  * Describes all the constants for the projects
  */
object Constants {
  val MY_EMAIL_ID: CharSequence = "msiddiq1894@gmail.com"

  val TEST_QUERY: String = "{viewer {email login url}}"


  val JAVA_LANGUAGE = "java"
  val SCALA_LANGUAGE = "scala"
  val CPP_LANGUAGE = "cpp"
  val C_LANGUAGE = "c"
  val PYTHON_LANGUAGE = "python"
  val NUMBER_OF_LINES = 210


  val TOP_REPO_FINDER_JSON: String =
    """{
      |      "data": {
      |        "search": {
      |        "repositoryCount": 6859653,
      |        "edges": [
      |      {
      |        "node": {
      |        "url": "https://github.com/elastic/elasticsearch",
      |        "forkCount": 14886,
      |        "name": "elasticsearch",
      |        "description": "Open Source, Distributed, RESTful Search Engine",
      |        "releases": {
      |        "totalCount": 8
      |      },
      |        "commitComments": {
      |        "totalCount": 1077
      |      },
      |        "pullRequests": {
      |        "totalCount": 25788
      |      },
      |        "stargazers": {
      |        "totalCount": 44347
      |      },
      |        "watchers": {
      |        "totalCount": 2774
      |      },
      |        "issues": {
      |        "totalCount": 21157
      |      }
      |      }
      |      },
      |      {
      |        "node": {
      |        "url": "https://github.com/ReactiveX/RxJava",
      |        "forkCount": 6810,
      |        "name": "RxJava",
      |        "description": "RxJava – Reactive Extensions for the JVM – a library for composing asynchronous and event-based programs using observable sequences for the Java VM.",
      |        "releases": {
      |        "totalCount": 180
      |      },
      |        "commitComments": {
      |        "totalCount": 100
      |      },
      |        "pullRequests": {
      |        "totalCount": 3252
      |      },
      |        "stargazers": {
      |        "totalCount": 40558
      |      },
      |        "watchers": {
      |        "totalCount": 2370
      |      },
      |        "issues": {
      |        "totalCount": 2773
      |      }
      |      }
      |      },
      |      {
      |        "node": {
      |        "url": "https://github.com/kdn251/interviews",
      |        "forkCount": 8082,
      |        "name": "interviews",
      |        "description": "Everything you need to know to get the job.",
      |        "releases": {
      |        "totalCount": 0
      |      },
      |        "commitComments": {
      |        "totalCount": 1
      |      },
      |        "pullRequests": {
      |        "totalCount": 96
      |      },
      |        "stargazers": {
      |        "totalCount": 38947
      |      },
      |        "watchers": {
      |        "totalCount": 2277
      |      },
      |        "issues": {
      |        "totalCount": 36
      |      }
      |      }
      |      },
      |      {
      |        "node": {
      |        "url": "https://github.com/square/okhttp",
      |        "forkCount": 7505,
      |        "name": "okhttp",
      |        "description": "An HTTP client for Android, Kotlin, and Java.",
      |        "releases": {
      |        "totalCount": 0
      |      },
      |        "commitComments": {
      |        "totalCount": 148
      |      },
      |        "pullRequests": {
      |        "totalCount": 2601
      |      },
      |        "stargazers": {
      |        "totalCount": 34408
      |      },
      |        "watchers": {
      |        "totalCount": 1664
      |      },
      |        "issues": {
      |        "totalCount": 2817
      |      }
      |      }
      |      },
      |      {
      |        "node": {
      |        "url": "https://github.com/google/guava",
      |        "forkCount": 7551,
      |        "name": "guava",
      |        "description": "Google core libraries for Java",
      |        "releases": {
      |        "totalCount": 27
      |      },
      |        "commitComments": {
      |        "totalCount": 249
      |      },
      |        "pullRequests": {
      |        "totalCount": 512
      |      },
      |        "stargazers": {
      |        "totalCount": 33888
      |      },
      |        "watchers": {
      |        "totalCount": 2467
      |      },
      |        "issues": {
      |        "totalCount": 3021
      |      }
      |      }
      |      }
      |        ]
      |      }
      |      }
      |}""".stripMargin

  val CREATE_REPO_TEST_QUERY: String =
    """{
      |        "node": {
      |        "url": "https://github.com/elastic/elasticsearch",
      |        "forkCount": 14886,
      |        "name": "elasticsearch",
      |        "description": "Open Source, Distributed, RESTful Search Engine",
      |        "releases": {
      |        "totalCount": 8
      |      },
      |        "commitComments": {
      |        "totalCount": 1077
      |      },
      |        "pullRequests": {
      |        "totalCount": 25788
      |      },
      |        "stargazers": {
      |        "totalCount": 44347
      |      },
      |        "watchers": {
      |        "totalCount": 2774
      |      },
      |        "issues": {
      |        "totalCount": 21157
      |      }
      |      }
      |      }""".stripMargin


  val ISSUE_NODE: String =
    """{
      |          "node": {
      |            "url": "https://github.com/CyC2018/CS-Notes",
      |            "forkCount": 25208,
      |            "name": "CS-Notes",
      |            "description": ":books: Tech Interview Guide 技术面试必备基础知识、Leetcode 题解、Java、C++、Python、后端面试、操作系统、计算机网络、系统设计",
      |            "owner": {
      |              "url": "https://github.com/CyC2018",
      |              "followers": {
      |                "totalCount": 8255
      |              }
      |            },
      |            "releases": {
      |              "totalCount": 0
      |            },
      |            "commitComments": {
      |              "totalCount": 14,
      |              "edges": [
      |                {
      |                  "node": {
      |                    "commit": {
      |                      "author": {
      |                        "name": "CyC2018"
      |                      },
      |                      "message": "auto commit",
      |                      "status": {
      |                        "state": "SUCCESS"
      |                      },
      |                      "pushedDate": "2019-07-13T15:53:36Z"
      |                    },
      |                    "author": {
      |                      "login": "xiaoxuemei744",
      |                      "avatarUrl": "https://avatars1.githubusercontent.com/u/55256484?v=4",
      |                      "url": "https://github.com/xiaoxuemei744"
      |                    },
      |                    "createdAt": "2019-09-16T09:53:58Z",
      |                    "bodyText": "o"
      |                  }
      |                },
      |                {
      |                  "node": {
      |                    "commit": {
      |                      "author": {
      |                        "name": "CyC2018"
      |                      },
      |                      "message": "auto commit",
      |                      "status": {
      |                        "state": "SUCCESS"
      |                      },
      |                      "pushedDate": "2019-07-13T15:53:36Z"
      |                    },
      |                    "author": {
      |                      "login": "xiaoxuemei744",
      |                      "avatarUrl": "https://avatars1.githubusercontent.com/u/55256484?v=4",
      |                      "url": "https://github.com/xiaoxuemei744"
      |                    },
      |                    "createdAt": "2019-09-16T09:55:09Z",
      |                    "bodyText": "1"
      |                  }
      |                },
      |                {
      |                  "node": {
      |                    "commit": {
      |                      "author": {
      |                        "name": "CyC2018"
      |                      },
      |                      "message": "auto commit",
      |                      "status": {
      |                        "state": "SUCCESS"
      |                      },
      |                      "pushedDate": "2019-07-13T15:53:36Z"
      |                    },
      |                    "author": {
      |                      "login": "xiaoxuemei744",
      |                      "avatarUrl": "https://avatars1.githubusercontent.com/u/55256484?v=4",
      |                      "url": "https://github.com/xiaoxuemei744"
      |                    },
      |                    "createdAt": "2019-09-16T09:55:20Z",
      |                    "bodyText": "2"
      |                  }
      |                },
      |                {
      |                  "node": {
      |                    "commit": {
      |                      "author": {
      |                        "name": "CyC2018"
      |                      },
      |                      "message": "auto commit",
      |                      "status": {
      |                        "state": "SUCCESS"
      |                      },
      |                      "pushedDate": "2019-07-13T15:53:36Z"
      |                    },
      |                    "author": {
      |                      "login": "xiaoxuemei744",
      |                      "avatarUrl": "https://avatars1.githubusercontent.com/u/55256484?v=4",
      |                      "url": "https://github.com/xiaoxuemei744"
      |                    },
      |                    "createdAt": "2019-09-16T09:56:35Z",
      |                    "bodyText": "2"
      |                  }
      |                },
      |                {
      |                  "node": {
      |                    "commit": {
      |                      "author": {
      |                        "name": "CyC2018"
      |                      },
      |                      "message": "auto commit",
      |                      "status": {
      |                        "state": "SUCCESS"
      |                      },
      |                      "pushedDate": "2019-07-13T15:53:36Z"
      |                    },
      |                    "author": {
      |                      "login": "Detective0",
      |                      "avatarUrl": "https://avatars0.githubusercontent.com/u/51633087?v=4",
      |                      "url": "https://github.com/Detective0"
      |                    },
      |                    "createdAt": "2019-09-16T10:08:22Z",
      |                    "bodyText": "Thank you very much.------------------ 原始邮件 ------------------\n发件人: \"xiaoxuemei744\"<notifications@github.com>\n发送时间: 2019年9月16日(星期一) 晚上6:00\n收件人: \"CyC2018/CS-Notes\"<CS-Notes@noreply.github.com>;\n抄送: \"Subscribed\"<subscribed@noreply.github.com>;\n主题: Re: [CyC2018/CS-Notes] auto commit (e8d80f8)\n\n\n\n2\n\n&mdash;\nYou are receiving this because you are subscribed to this thread.\nReply to this email directly, view it on GitHub, or mute the thread."
      |                  }
      |                }
      |              ]
      |            },
      |            "pullRequests": {
      |              "totalCount": 441,
      |              "edges": [
      |                {
      |                  "node": {
      |                    "bodyText": "Next-Key Locks都是前开后闭区间，实现上，InnoDB给每个索引加了一个不存在的最大值supremum， 这样才符合“都是前开后闭区间”的定义。",
      |                    "title": "间隙锁前开后闭",
      |                    "state": "MERGED",
      |                    "merged": true,
      |                    "author": {
      |                      "login": "RilaShu",
      |                      "avatarUrl": "https://avatars0.githubusercontent.com/u/23717459?v=4",
      |                      "url": "https://github.com/RilaShu"
      |                    },
      |                    "createdAt": "2019-09-09T04:41:12Z",
      |                    "url": "https://github.com/CyC2018/CS-Notes/pull/785"
      |                  }
      |                },
      |                {
      |                  "node": {
      |                    "bodyText": "modify the description of \"删除版本号\" to avoid difficulties in understanding",
      |                    "title": "modify the description",
      |                    "state": "MERGED",
      |                    "merged": true,
      |                    "author": {
      |                      "login": "hjcui",
      |                      "avatarUrl": "https://avatars3.githubusercontent.com/u/24602398?v=4",
      |                      "url": "https://github.com/hjcui"
      |                    },
      |                    "createdAt": "2019-09-12T06:41:31Z",
      |                    "url": "https://github.com/CyC2018/CS-Notes/pull/786"
      |                  }
      |                },
      |                {
      |                  "node": {
      |                    "bodyText": "",
      |                    "title": "修正Leetcode题解的位运算基本原理部分的描述错误",
      |                    "state": "OPEN",
      |                    "merged": false,
      |                    "author": {
      |                      "login": "professorxin",
      |                      "avatarUrl": "https://avatars0.githubusercontent.com/u/38785214?v=4",
      |                      "url": "https://github.com/professorxin"
      |                    },
      |                    "createdAt": "2019-09-17T05:49:05Z",
      |                    "url": "https://github.com/CyC2018/CS-Notes/pull/790"
      |                  }
      |                },
      |                {
      |                  "node": {
      |                    "bodyText": "幻读与不可重复读区别",
      |                    "title": "Update 数据库系统原理.md",
      |                    "state": "OPEN",
      |                    "merged": false,
      |                    "author": {
      |                      "login": "linkingli",
      |                      "avatarUrl": "https://avatars1.githubusercontent.com/u/28832157?v=4",
      |                      "url": "https://github.com/linkingli"
      |                    },
      |                    "createdAt": "2019-09-17T15:54:52Z",
      |                    "url": "https://github.com/CyC2018/CS-Notes/pull/791"
      |                  }
      |                },
      |                {
      |                  "node": {
      |                    "bodyText": "在正则表达式文档中，去掉几个多余或者不应该存在的空格。",
      |                    "title": "remove unexpected spaces",
      |                    "state": "OPEN",
      |                    "merged": false,
      |                    "author": {
      |                      "login": "jianpingbadao",
      |                      "avatarUrl": "https://avatars0.githubusercontent.com/u/7081770?v=4",
      |                      "url": "https://github.com/jianpingbadao"
      |                    },
      |                    "createdAt": "2019-09-19T19:30:08Z",
      |                    "url": "https://github.com/CyC2018/CS-Notes/pull/793"
      |                  }
      |                }
      |              ]
      |            },
      |            "stargazers": {
      |              "totalCount": 78956
      |            },
      |            "watchers": {
      |              "totalCount": 4078
      |            },
      |            "issues": {
      |              "totalCount": 338,
      |              "edges": [
      |                {
      |                  "node": {
      |                    "title": "剑值offer跳台阶迭代解法时result的初始值",
      |                    "body": "```\r\npublic int JumpFloor(int n) {\r\n    if (n <= 2)\r\n        return n;\r\n    int pre2 = 1, pre1 = 2;\r\n    int result = 1;\r\n    for (int i = 2; i < n; i++) {\r\n        result = pre2 + pre1;\r\n        pre2 = pre1;\r\n        pre1 = result;\r\n    }\r\n    return result;\r\n}\r\n```\r\nresult 初始值是否应该为0",
      |                    "url": "https://github.com/CyC2018/CS-Notes/issues/795",
      |                    "createdAt": "2019-09-25T03:54:49Z",
      |                    "author": {
      |                      "url": "https://github.com/haobinaa",
      |                      "resourcePath": "/haobinaa",
      |                      "login": "haobinaa",
      |                      "avatarUrl": "https://avatars3.githubusercontent.com/u/10074780?v=4"
      |                    }
      |                  }
      |                },
      |                {
      |                  "node": {
      |                    "title": "LeetCode bfs 1. 计算在网格中从原点到特定点的最短路径长度 感觉有问题",
      |                    "body": "这个题跟LeetCode1091一样，标记的那行程序的位置感觉不对。应该一放进queue就立刻标记吧",
      |                    "url": "https://github.com/CyC2018/CS-Notes/issues/796",
      |                    "createdAt": "2019-09-27T09:09:23Z",
      |                    "author": {
      |                      "url": "https://github.com/ichase5",
      |                      "resourcePath": "/ichase5",
      |                      "login": "ichase5",
      |                      "avatarUrl": "https://avatars1.githubusercontent.com/u/35161374?v=4"
      |                    }
      |                  }
      |                }
      |              ]
      |            }
      |          }
      |        }""".stripMargin


}
