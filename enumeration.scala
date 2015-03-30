sealed trait Color
case class Blue() extends Color
case class Red() extends Color
case class Green() extends Color
case class White() extends Color

object Enumeration {
  def f(color: Color) = {
    color match {
      case r: Red => r
      case b: Blue => b
      case g: Green => g
      case w: White => w
    }
  }

  def main(args: Array[String]): Unit = {
    println(f(new Red()))
    println(f(new Blue()))
    println(f(new Green()))
    println(f(new White()))
  }
}

