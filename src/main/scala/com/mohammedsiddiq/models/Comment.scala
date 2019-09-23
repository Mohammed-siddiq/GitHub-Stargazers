package com.mohammedsiddiq.models

import java.util.Date

/**
  * Represents the comment on github
  *
  * @param author    The commenting author
  * @param content   The comment
  * @param createdAt Date created
  */
class Comment(author: Actor, content: String, createdAt: Date)