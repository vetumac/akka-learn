package supervisor

import akka.actor.{Actor, Props, SupervisorStrategy}

class Parent extends Actor {


  override def supervisorStrategy: SupervisorStrategy = super.supervisorStrategy

  override def receive: Receive = {
    case str: String =>
      sender() ! context.system.actorOf(Props[Child])
    case s =>
      printf("unrecognized " + s)
  }
}
