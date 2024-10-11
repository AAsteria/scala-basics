object Main {
    def main(args: Array[String]): Unit = {
        def fibonacci(n: Int): Int = n match {
            case 0 | 1 => n
            case _ => fibonacci(n-1) + fibonacci(n-2)
        }

        // use case by passing to a higher order function
        val l = List(("a",1),("b",2),("c",3))
        l.map { case (k,v) => s"$k\t$v" }
        // l.map(e => s"${e. _1}\t${e._2}") // tuple indices start at 1

        // case class
        // case class Book(isbn: String)
        // val ctci = Book("978-0984782864")
        // val ctci2 = Book("978-0134092669")

        // Instances of case classes are compared by structure, not by reference
        // scala> val eq = ctci == ctci2
        // eq: Boolean = true

        // pattern matching on case classes
        abstract class Item
        case class Book(isbn : String) extends Item
        case class Magazine(issn : String) extends Item
        val i  = Book("978-0984782864")
        def printSerialNumber(item : Item) = item match {
            case Book(b) => println("ISBN: " + b)
            case Magazine(m) => println("ISSN: " + m)
            case _ =>
        }
        printSerialNumber(i)
    }
}