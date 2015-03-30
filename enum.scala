sealed abstract class Color(n: Int)
case class Blue() extends Color(0)
case class Red() extends Color(1)
case class Green() extends Color(2)
case class White() extends Color(3)

object Enum {
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

