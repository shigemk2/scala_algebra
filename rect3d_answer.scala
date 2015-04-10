sealed trait Coordinates
case class Point(x: Int, y: Int) extends Coordinates
case class Point3D(x: Int, y: Int, z: Int) extends Coordinates
case class Rect(x: Int, y: Int, w: Int, h: Int) extends Coordinates
case class Rect3D(x: Int, y: Int, z: Int, w: Int, h: Int, d: Int) extends Coordinates

def contains(r: Rect, p: Point): Boolean = {
  r.x <= p.x && p.x < r.x + r.w && r.y <= p.y && p.y < r.y + r.h
}

def contains(r: Rect3D, p: Point3D): Boolean = {
  r.x <= p.x && p.x < r.x + r.w &&
  r.y <= p.y && p.y < r.y + r.h &&
  r.z <= p.z && p.z < r.z + r.d
}

println(contains(new Rect(2, 2, 3, 3), new Point(1, 1)))
println(contains(new Rect(2, 2, 3, 3), new Point(2, 2)))
println(contains(new Rect(2, 2, 3, 3), new Point(3, 3)))
println(contains(new Rect(2, 2, 3, 3), new Point(4, 4)))
println(contains(new Rect(2, 2, 3, 3), new Point(5, 5)))
println(contains(new Rect3D(2, 2, 2, 3, 3, 3), new Point3D(1, 1, 1)))
println(contains(new Rect3D(2, 2, 2, 3, 3, 3), new Point3D(2, 2, 2)))
println(contains(new Rect3D(2, 2, 2, 3, 3, 3), new Point3D(3, 3, 3)))
println(contains(new Rect3D(2, 2, 2, 3, 3, 3), new Point3D(4, 4, 4)))
println(contains(new Rect3D(2, 2, 2, 3, 3, 3), new Point3D(5, 5, 5)))
