abstract class Test {
  def foo: String = "?"
}

class TestInt(x: Int) extends Test {
  override def foo: String = {
    if (x == 1) {
      "bar"
    } else {
      super.foo
    }
  }
}

class TestStr(x: String) extends Test {
  override def foo: String = {
    if (x == "1") {
      "baz"
    } else {
      super.foo
    }
  }
}

println(new TestInt(0).foo)
println(new TestInt(1).foo)
println(new TestStr("0").foo)
println(new TestStr("1").foo)
