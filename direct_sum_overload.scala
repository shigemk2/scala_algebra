class Test {
  def foo: String = "?"
  def foo(x: Int): String = {
    if (x == 1) {
      "bar"
    } else {
      foo
    }
  }
  def foo(x: String): String = {
    if (x == "1") {
      "baz"
    } else {
      foo
    }
  }
}

println(new Test().foo(0))
println(new Test().foo(1))
println(new Test().foo("0"))
println(new Test().foo("1"))
