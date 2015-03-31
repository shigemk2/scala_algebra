object Color extends Enumeration {
  val Blue, Red, Green, White = Value
}

object Main {
  import Color._

  def main(args: Array[String]): Unit = {
    println(Blue.id)
    println(Red.id)
    println(Green.id)
    println(White.id)
    println(Color(0))
    println(Color(1))
    println(Color(2))
    println(Color(3))
  }
}
