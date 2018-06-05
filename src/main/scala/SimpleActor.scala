import akka.actor.Actor

class SimpleActor extends Actor {
  override def receive: Receive = {
    case "error" =>
      println(s"error -> ${Thread.currentThread()}")
      throw new Exception("error")
    case a: String =>
      println(s"$a -> ${Thread.currentThread()}")
  }
}
