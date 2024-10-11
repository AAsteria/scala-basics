object Main {
    def main(args: Array[String]): Unit = {
        // pattern matching good for unpacking `Option` type
        val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
        println(capitals get "France")
        // Option[String] = Some(Paris)
        println(capitals get "North Pole")
        // Option[String] = None
    }
}