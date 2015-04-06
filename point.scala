sealed trait Coordinates
case class Point(x: Int, y: Int) extends Coordinates

def offset(p1: Point, p2: Point): Point = {
  Point(p1.x + p2.x, p1.y + p2.y)
}

val p1 = Point(2, 3)
val p2 = Point(1, 1)
println(offset(p1, p2))
