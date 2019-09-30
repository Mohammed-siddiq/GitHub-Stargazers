package com.mohammedsiddiq.models.buiderpattern

/**
  * Models an actor on Github platform
  *
  * @param avatarUrl The Avatar Url of the actor
  * @param userName  The userName of the Actor
  * @param url       Http url of the actor
  */

case class Actor(avatarUrl: String = "", userName: String = "", url: String = "")