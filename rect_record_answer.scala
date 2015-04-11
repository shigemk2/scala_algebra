sealed trait Coordinates
case class Point(x: Int, y: Int) extends Coordinates
case class Rect(x: Int, y: Int, w: Int, h: Int) extends Coordinates

def contains(r: Rect, p: Point): Boolean = {
  r.x <= p.x && p.x < r.x + r.w && r.y <= p.y && p.y < r.y + r.h
}

println(contains(new Rect(x = 2, y = 2, w = 3, h = 3), new Point(x = 1, y = 1)))
println(contains(new Rect(x = 2, y = 2, w = 3, h = 3), new Point(x = 2, y = 2)))
println(contains(new Rect(x = 2, y = 2, w = 3, h = 3), new Point(x = 3, y = 3)))
println(contains(new Rect(x = 2, y = 2, w = 3, h = 3), new Point(x = 4, y = 4)))
println(contains(new Rect(x = 2, y = 2, w = 3, h = 3), new Point(x = 5, y = 5)))

