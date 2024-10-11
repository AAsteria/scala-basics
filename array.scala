object Main {
    def main(args: Array[String]): Unit = {
        // Scala encourages to use 'val' instead of 'var'
        // 'val' is preferred in parallel programming since it is immutable;
        // cautious with using var when composing lambda functions, 
        // which will be executed in parallel when passed to 
        // higher-order functions.
        val nums = new Array[Int](10);
        val s = Array("Hello", "world")

        print(s(0)) // Hello
    }
}