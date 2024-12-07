package bt.factorial

import functions.{timeIt, factorial, evaluateArgs, sumFuncResults, gcd, backAggFuncResultsForRange => backAggFRange}


object Main extends App {

  println("\nFactorial v1.0.0")

  private val defaultVal = 20
  private val param: Int = evaluateArgs(args, defaultVal)

  timeIt {
    for (i <- 1 to param) println (s"factorial $i is: ${fansi.Color.Magenta(factorial(i).toString())}")

    // sum all factorial values until param
    val sumOfFactorials = sumFuncResults(factorial, param)

    // Now cummulated difference with lambda expression, note y - x in aggFunc + reduceRight in backAggFuncResultsForRange!
    // Because we want subtract all next values from the last (biggest) factorial and subtract them one by one!
    val diffOfFactorials = backAggFRange(factorial, (x, y) => y - x)(1, param)

    val gcdFact = gcd(sumOfFactorials, diffOfFactorials)
    val greyText = fansi.Color.True(130, 170, 130)(s"(${(sumOfFactorials/gcdFact).toString}, ${(diffOfFactorials/gcdFact).toString})")

    println(s"Sum of all above values is: ${fansi.Color.Cyan(sumOfFactorials.toString())}")
    println(s"Cumulated difference value: ${fansi.Color.Cyan(diffOfFactorials.toString)}")
    println(s"Greatest common denominator of sum and difference: ${fansi.Color.Green(gcdFact.toString)} $greyText")
  }

}
