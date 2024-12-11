```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

object MainObject extends App {
  val obj = new MyClass(5)
  println(obj.myMethod(10))
  // This will cause a NullPointerException in Java, but not necessarily in Scala
  println(obj.toString) // toString not explicitly defined. Depends on how you defined it or compiler's default
}
```