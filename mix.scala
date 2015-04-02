object Color extends Enumeration {
  val Blue, Red, Magenta, Green, Cyan, Yellow, White = Value
}

object Main {
  import Color._

  def main(args: Array[String]): Unit = {
    // id
    println(Blue.id)
    println(Red.id)
    println(Green.id)
    println(White.id)
    // apply
    println(Color(0))
    println(Color(1))
    println(Color(2))
    println(Color(3))
    // maxId
    println(Color.maxId)
    // values
    println(Color.values)
    // withName
    println(Color.withName("Red"))
  }
}
