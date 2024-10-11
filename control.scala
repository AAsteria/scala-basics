object Main {
    def main(args: Array[String]): Unit = {
        // if-else
        val s = if (x > 0) 1 else -1
        // compare with Java: int s = x > 0 ? 1 : -1

        // loops
        // differentiate scala from purely functional languages
        // which mostly rely on recursion to perform same work
        while (n > 0) {
            r = r * n
            n -= 1
        }

        do {
            r = r * n
            n -= 1
        } while (n > 0)

        // inclusive [1..n]
        for (i <- 1 to n) r = r * i
        // if don't want to include the upper bound
        for (i <- 0 until s.length)
            sum += s(i)
        
        // `break` & `continue` do not exist in Scala
    }
}