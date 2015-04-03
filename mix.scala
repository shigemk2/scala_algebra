object Color extends Enumeration {
  val Blue, Red, Magenta, Green, Cyan, Yellow, White = Value
}

object Main {
  import Color._

  def mix(a:Color.Value, b:Color.Value): Color.Value = {
    (a, b) match {
      case (Blue, Red)       => Magenta
      case (Blue, Magenta)   => Magenta
      case (Blue, Green)     => Cyan
      case (Blue, Cyan)      => Cyan
      case (Blue, Yellow)    => White
      case (Red, Magenta)    => Magenta
      case (Red, Green)      => Yellow
      case (Red, Cyan)       => White
      case (Red, Yellow)     => Yellow
      case (Magenta, Green)  => White
      case (Magenta, Cyan)   => White
      case (Magenta, Yellow) => White
      case (Green, Cyan)     => Cyan
      case (Green, Yellow)   => Yellow
      case (Cyan, Yellow)    => White
      case (White, _)        => White
      case (a, b) if a == b  => a
      case (a, b)            => mix(b, a)
    }
  }

  def main(args: Array[String]): Unit = {
    println(mix(Red, Red))
    println(mix(Red, Blue))
    println(mix(Blue, mix(Blue, Green)))
  }
}
