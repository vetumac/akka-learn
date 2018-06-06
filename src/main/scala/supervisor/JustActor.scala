package supervisor

import akka.actor.{Actor, ActorRef}

class JustActor extends Actor {
  override def receive: Receive = {
    case ref: ActorRef =>
      ref ! 5
      ref ! "get"
      ref ! "error"

    case i: Int => println(i)
  }
}
