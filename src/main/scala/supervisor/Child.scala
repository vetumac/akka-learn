package supervisor

import akka.actor.Actor

class Child extends Actor {

  var state: Int = _

  override def receive: Receive = {
    case i: Int =>
      state = i
    case "get" =>
      sender() ! state
    case "error" =>
      throw new Exception("error")
  }
}
