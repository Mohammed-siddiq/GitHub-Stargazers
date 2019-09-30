package com.mohammedsiddiq.models.buiderpattern

import java.util.Date

/**
  * Represents the comment on github using a builder pattern
  *
  * @param author    The commenting author
  * @param message   The comment
  * @param createdAt Date created
  */
case class Comment(author: Actor, message: String, createdAt: Date){

}
