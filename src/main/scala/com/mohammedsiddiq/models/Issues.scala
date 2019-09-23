package com.mohammedsiddiq.models

import java.util.Date

/**
  * Models an Issue
  *
  * @param author    The author creating the issue
  * @param body      Issue body
  * @param createdAt Date created
  * @param title     Issue title
  * @param issueLink URL
  */
class Issues(author: Actor, body: String, createdAt: Date, title: String, issueLink: String)
