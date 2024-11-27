package bt.factorial

import functions._


object Main extends App {

  println("\nFactorial v1.0.0")

  private val defaultVal = 20
  private val param: Int = evaluateArgs(args, defaultVal)

  timeIt {
    for (i <- 1 to param) println (s"factorial $i is: ${fansi.Color.Magenta(factorial(i).toString())}")
    println(s"Sum of all above values is: ${fansi.Color.Cyan(sumFuncResults(factorial, param).toString())}")
    println(s"Sum of results of parametrized mySym function is sumFuncResultsParametrized(mySum, $param)($param, $param) is ${sumFuncResultsParametrized(mySum, param)(param, param)}")
  }

}
