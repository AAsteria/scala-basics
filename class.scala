// The constructor is defined in the class signature and 
// it can have optional parameters by providing default values.
class Point(var x: Int = 0, var y: Int = 0) {
    def move(dx: Int, dy: Int): Unit = { // Unit similar to void
        x = x + dx
        y = y + dy
    }
    // By default, Scala will not print class attributes 
    // unless you define how it should.
    override def toString(): String = 
        s"($x, $y)"
}

// test
object Main {
    def main(args: Array[String]): Unit ={
        val point1 = new Point
        println(point1.x)  // 0
        println(point1)

        val point2 = new Point(2, 3)
        println(point2.x)  // 2
        println(point2)

        val point3 = new Point(10, 20)
        point3.move(50, -30)
        println(point3)
    }
}