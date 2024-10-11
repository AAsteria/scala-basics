// https://docs.scala-lang.org/scala3/book/interacting-with-java.html

object Main {
  // Create an instance of the Java class
  val javaClass = new JavaClass()

  // Call the Java method
  val greeting = javaClass.greet("Scala User")
  println(greeting) // Output: Hello, Scala User!
}

// javac JavaClass.java
// scalac Main.scala
// scala -cp .
// val javaClass = new JavaClass()
// println(javaClass.greet("Scala User"))

