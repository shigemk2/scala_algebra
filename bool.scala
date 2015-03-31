object Bool extends Enumeration {
  type Bool = Value
  val True, False = Value
}

object Main {
  import Bool._

  def main(args: Array[String]): Unit = {
    println(True)
    println(False)
    println(Bool(0))
    println(Bool(1))
  }
}
