object Main {
    def main(args: Array[String]): Unit = {
        val x = 5
        val y = 7
        // block enclosed in {} with a value of the last expression
        val distance = {
            val dx = x - 2
            val dy = y - 3
            math.sqrt(dx * dx + dy * dy)
        }
        print(distance) // distance: Double = 5.0
    }
}