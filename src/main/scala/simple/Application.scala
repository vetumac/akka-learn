package simple

import akka.actor.{ActorSystem, Props}
import akka.routing.RoundRobinPool

object Application extends App {
  val actorSystem = ActorSystem("akka-system")
  val simpleActor = actorSystem.actorOf(RoundRobinPool(5).props(Props[SimpleActor]), "simple-actor")
  val secondActor = actorSystem.actorOf(Props[SecondActor], "second-actor")
  simpleActor ! secondActor
  simpleActor ! secondActor
  simpleActor ! secondActor
  simpleActor ! secondActor
  simpleActor ! secondActor
  //  simpleActor ! "ccc1"
  //  simpleActor ! "error"
  //  simpleActor ! "error"
  //  simpleActor ! "error"
  //  simpleActor ! "ccc2"
  //  simpleActor ! "error"

}
