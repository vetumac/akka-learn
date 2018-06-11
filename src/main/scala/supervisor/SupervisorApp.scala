package supervisor

object SupervisorApp extends App {
  //  val actorSystem = ActorSystem("akka-system")
  //  val parent = actorSystem.actorOf(Props[Parent])
  //  implicit val justActor: ActorRef = actorSystem.actorOf(Props[JustActor])
  //  parent ! "new"

  var x = 10

  val f: String => Int = {
    case "sss" => 2 + x
  }

  println(f("sss"))

  println(f("xdd"))

}
