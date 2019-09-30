package com.mohammedsiddiq.models.buiderpattern

import java.util.Date

/**
  * Models an Issue with a builder pattern
  *
  * @param author    The author creating the issue
  * @param body      Issue body
  * @param createdAt Date created
  * @param title     Issue title
  * @param issueLink URL
  */
case class Issue(author: Actor = null,
                 body: String = "",
                 createdAt: Date = null,
                 title: String = "",
                 issueLink: String = " ") {

}
