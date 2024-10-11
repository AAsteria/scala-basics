import scala.math._

object Main {
    def main(args: Array[String]): Unit = {
        // must specify types of all params
        // no need to specify return type as long as is not recursive
        def fac(n: Int) = {
            var r = 1
            for (i <- 1 to n) r = r * 1
            r
        }

        // higher-order functions
        // In fp languages, functions are first-class citizens that 
        // can be passed around and manipulated just like other data types.
        val num = 3.14
        val fun = ceil _ // fun is a variable containing a function, not fixed *
        // can give fun to another function
        Array(3.14, 1.42, 2.0).map(fun) // Array(4.0, 2.0, 2.0)

        // pure functions
        // A pure function is a function where the return value is 
        // only determined by its input values without 
        // any observable side effects.
        def addOne(x: Int): Int = x + 1 // same input, same output**

        // anonymous function
        (x: Double) => 3 * x
        Array(3.14, 1.42, 2.0).map( (x: Double) => 3 * x)
        Array(3.14, 1.42, 2.0).map( (x) => 3 * x)
        // If a parameter occurs only once on the right-hand side of the =>, 
        // can replace it with a single underscore
        Array(3.14, 1.42, 2.0).map( 3 * _)
        
        // these shortcuts only work when the parameter types are known
        // val f = _ + _ // error
        val f = (_: Int) + (_: Int) // f: (Int, Int) => Int

        // more than one statement
        Array(3.14, 1.42, 2.0).map(x => {
            println(s"x: $x")
            3 * x
        })
    }
}

// *
// In the ceil _ example above, the underscore is not a placeholder 
// for a single parameter but a parameter list. 
// ceil _ is an example of a partially applied function, which 
// is an expression where you give some (or none) of the required arguments.

// ** 
// With these features, pure functions are able to produce 
// active parallel replication in parallel applications.
