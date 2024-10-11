// https://docs.scala-lang.org/scala3/book/introduction.html

object Main {
    def main(args: Array[String]): Unit = {
        // map and flatmap
        val l = List(("a", 1), ("b", 2), ("c", 3))
        l.map{case (k, v) => List((k, v), (k, v + 10))}
        // List[List[(String, Int)]] = 
        // List(List((a,1), (a,11)), List((b,2), (b,12)), List((c,3), (c,13)))
        l.flatMap{case (k, v) => List((k, v), (k, v + 10))}
        // List[(String, Int)] = 
        // List((a,1), (a,11), (b,2), (b,12), (c,3), (c,13))

        // reduce and folding
        // reduce takes a function to reduce the collection to one element
        l.reduce{(x, y) => (x._1 + y._1 + x._2 + y._2)}
        // (String, Int) = (abcd, 10)

        // folding (/: left and :\ right) 
        val k = List("i", "love", "cloud", "computing")
        println(("" /: k) (_ + " " + _)) " i love cloud computing"

        // filtering
        val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        nums.filter(_ % 2 == 0)
    }
}