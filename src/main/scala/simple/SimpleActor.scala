package simple

import akka.actor.Actor

class SimpleActor extends Actor {
  override def postStop(): Unit = {
    println(s"postStop -> ${Thread.currentThread()} -> ${this.asInstanceOf[Object]}")
  }

  override def preStart(): Unit = {
    println(s"preStart -> ${Thread.currentThread()} -> ${this.asInstanceOf[Object]}")
  }

  override def receive: Receive = {
    case "error" =>
      println(s"error -> ${Thread.currentThread()} -> ${this.asInstanceOf[Object]}")
      Thread.sleep(3000)
      throw new Exception("error")
    case a: String =>
      println(s"$a -> ${Thread.currentThread()} -> ${this.asInstanceOf[Object]}")
      Thread.sleep(3000)
  }
}
