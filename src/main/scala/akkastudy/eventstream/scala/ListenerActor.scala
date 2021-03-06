package akkastudy.eventstream.scala

import akka.actor.{DeadLetter, Actor}
import akka.event.Logging

class ListenerActor extends Actor {
  val log = Logging(context.system, this)

  def receive = {
    case x:DeadLetter ⇒ log.info("received a dead letter with message: {}", x.message)
    case y ⇒ log.info("received unknown message test in Simple Actor Scala: {}", y)
  }
}
