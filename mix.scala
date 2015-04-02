object Color extends Enumeration {
  val Blue, Red, Magenta, Green, Cyan, Yellow, White = Value
}

object Main {
  import Color._

  def mix(a:Color.Value, b:Color.Value): Color.Value = {
    Color(a.id + b.id)
  }

  def main(args: Array[String]): Unit = {
    // mix
    println(mix(Blue, Blue))
    // mix
    println(mix(Blue, Red))
  }
}
