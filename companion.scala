class Main {
    def nonStaticMethod() = {
        println("not static")
    }
}

// companion object
object Main {
    val STATIC_FINAL_CONSTANT = "const"
    def staticMethod() = {
        println("static")
    }
}

var mainInstance: Main = new Main()
mainInstance.nonStaticMethod();

Main.staticMethod();
