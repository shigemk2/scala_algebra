trait Color
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
    }
  }

  def main(args: Array[String]): Unit = {
    val blue = new Blue()
    println(f(blue))
  }
}

