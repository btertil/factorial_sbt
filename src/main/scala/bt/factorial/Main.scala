package bt.factorial

import functions.{timeIt, factorial, evaluateArgs, sumFuncResults, backAggFuncResultsForRange => backAggFRange}


object Main extends App {

  println("\nFactorial v1.0.0")

  private val defaultVal = 20
  private val param: Int = evaluateArgs(args, defaultVal)

  timeIt {
    for (i <- 1 to param) println (s"factorial $i is: ${fansi.Color.Magenta(factorial(i).toString())}")
    println(s"Sum of all above values is: ${fansi.Color.Cyan(sumFuncResults(factorial, param).toString())}")
    
    // Now cummulated difference, note y - x in aggFunc + reduceRight in backAggFuncResultsForRange!
    // Because we want subtract all next values from the last (biggest) factorial and subtract is one by one!
    println(s"Cumulated difference value: ${fansi.Color.Cyan(backAggFRange(factorial, (x, y) => y - x)(1, param).toString)}")
  }

}
