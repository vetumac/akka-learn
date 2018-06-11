package simple

import akka.actor.Actor

class SecondActor extends Actor {
  override def postStop(): Unit = {
    println(s"postStop -> ${Thread.currentThread()} -> ${this.asInstanceOf[Object]} -> $self")
  }

  override def preStart(): Unit = {
    println(s"preStart -> ${Thread.currentThread()} -> ${this.asInstanceOf[Object]} -> $self")
  }

  override def receive: Receive = {
    case "error" =>
      println(s"error -> ${Thread.currentThread()} -> ${this.asInstanceOf[Object]} -> $self -> ${sender()}")
      Thread.sleep(3000)
      throw new Exception("error")
    case a: String =>
      println(s"$a -> ${Thread.currentThread()} -> ${this.asInstanceOf[Object]} -> $self -> ${sender()}")
      Thread.sleep(3000)
  }
}
