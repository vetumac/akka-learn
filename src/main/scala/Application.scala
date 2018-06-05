import akka.actor.{ActorSystem, Props}

object Application extends App {
  val actorSystem = ActorSystem("akka-system")
  val simpleActor = actorSystem.actorOf(Props(new SimpleActor), "simple-actor")
  simpleActor ! "error"
  simpleActor ! "ccc"
  simpleActor ! "error"
  simpleActor ! "ccc1"
  simpleActor ! "error"
  simpleActor ! "ccc2"
  simpleActor ! "error"

}
