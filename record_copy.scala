sealed trait Data
case class Foo(bar: Int, baz: String) extends Data

val f = new Foo(bar = 1, baz = "a")
println(f)
// f.bar = 2 // 直接の書き換えは出来ない
val g = f.copy(bar = 2)
println(g)
