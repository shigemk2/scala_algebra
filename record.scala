sealed trait Data
case class Foo(bar: Int, baz: String) extends Data

println(new Foo(bar = 1, baz = "a"))
println(new Foo(1, "a"))

