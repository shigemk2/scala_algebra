sealed trait Coordinates
case class Point(x: Int, y: Int) extends Coordinates
case class Rect(x: Int, y: Int, w: Int, h: Int) extends Coordinates

def contains(r: Rect, p: Point): Boolean = {
  r.x <= p.x && p.x < r.x + r.w && r.y <= p.y && p.y < r.y + r.h
}

println(contains(new Rect(2, 2, 3, 3), new Point(1, 1)))
println(contains(new Rect(2, 2, 3, 3), new Point(2, 2)))
println(contains(new Rect(2, 2, 3, 3), new Point(3, 3)))
println(contains(new Rect(2, 2, 3, 3), new Point(4, 4)))
println(contains(new Rect(2, 2, 3, 3), new Point(5, 5)))

