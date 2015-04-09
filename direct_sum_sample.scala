sealed trait Foo
case class Bar(x: Int, y: Int) extends Foo
case class Baz(x: Int, y: Int, z: Int) extends Foo
