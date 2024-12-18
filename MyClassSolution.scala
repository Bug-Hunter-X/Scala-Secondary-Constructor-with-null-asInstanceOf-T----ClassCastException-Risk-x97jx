```scala
class MyClass[T](val value: Option[T]) {
  def this() = this(None)
  def this(value: T) = this(Some(value))
}

// Example usage
val instance1 = new MyClass[String]() // value is None
val instance2 = new MyClass[Int](10) // value is Some(10)
val instance3 = new MyClass[String]("Hello") // value is Some("Hello")
```