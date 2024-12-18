# Scala Secondary Constructor ClassCastException Risk

This example demonstrates a potential runtime error in Scala when using `null.asInstanceOf[T]` within a secondary constructor. If the generic type `T` is not a nullable type (e.g., `String`, `Int`), attempting to assign `null` will result in a `ClassCastException` at runtime.

The provided code shows the problematic constructor and a solution to avoid the issue by using an Option[T].