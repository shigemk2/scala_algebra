sealed trait Data
case class Foo(bar: Int, baz: String) extends Data

val f1 = new Foo(bar = 1, baz = "a")
println(f1)
println(f1.bar, f1.baz)
val a, b = f1
println(a, b)
val c = f1.bar
println(c)
