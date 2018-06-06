package supervisor

import akka.actor.{ActorRef, ActorSystem, Props}

object SupervisorApp extends App {
  val actorSystem = ActorSystem("akka-system")
  val parent = actorSystem.actorOf(Props[Parent])
  implicit val justActor: ActorRef = actorSystem.actorOf(Props[JustActor])
  parent ! "new"


}
