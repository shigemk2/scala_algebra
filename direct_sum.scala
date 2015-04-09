sealed trait Test
case class TestInt(x: Int) extends Test
case class TestStr(x: String) extends Test

def foo(a: Test): String = a match {
  case TestInt(1)   => "bar"
  case TestStr("1") => "baz"
  case _            => "?"
}

println(foo(new TestInt(0)))
println(foo(new TestInt(1)))
println(foo(new TestStr("0")))
println(foo(new TestStr("1")))
