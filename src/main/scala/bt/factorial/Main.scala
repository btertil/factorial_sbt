package bt.factorial

import functions.{evaluateArgs, factorial, timeIt}


object Main extends App {

  println("\nFactorial v1.0.0")

  private val defaultVal = 20
  private val param: Int = evaluateArgs(args, defaultVal)

  timeIt {
    for (i <- 1 to param) println (s"factorial $i is: ${fansi.Color.Magenta(factorial(i).toString())}")
  }

}
