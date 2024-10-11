// Scala class hierarchy:
// https://docs.scala-lang.org/tour/unified-types.html

object Main {
    def main(args: Array[String]): Unit = {
        // strings, integers, characters, boolean values, and functions 
        // are all of type `Any`
        val list: List[Any] = List(
            "string",
            512,
            'c',
            true,
            () => "an anonymous func returning a str"
        )

        list.foreach(e => println(e))

        // type casting
        // Byte -> Short -> Int -> Long -> Float -> Double
        //          Char -> Int
        val x: Long = 987654321
        val y: Float = x.toFloat // 9.8765434E8
        // val z: Long = y (Does not conform)

        val face: Char = '☺'
        val number: Int = face // 9786

        // Nothing & Null
    }
}