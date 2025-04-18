package bt.factorial

import org.scalatest.funsuite.AnyFunSuite
import functions._

class UnitTests extends AnyFunSuite {
  test("Test mySum") {
    assert(mySum(3, 9) == 3 + 9, "mySum(3, 9) should be 12")
  }
  test("Factorial") {
    assert(factorial(5) == 2 * 3 * 4 * 5, "factorial(5) should be 120")
  }

  test("EvaluateArgs dwadzieścia") {
    assert(evaluateArgs(Array("jkjkjk"), defaultValue = 20) == 20, "evaluateArgs(\"dwadzieścia\", defaultValue = 20) should be 20")
  }

  test("EvaluateArgs 200") {
    assert(evaluateArgs(Array("200"), defaultValue = 20) == 20, "evaluateArgs(\"200\", defaultValue = 20) should be 20")
  }

  test("EvaluateArgs 5") {
    assert(evaluateArgs(Array("5"), defaultValue = 20) == 5, "evaluateArgs(\"5\", defaultValue = 20) should be 5")
  }

  test("EvaluateArgs -5") {
    assert(evaluateArgs(Array("-5"), defaultValue = 20) == 20, "evaluateArgs(\"-5\", defaultValue = 20) should be 20")
  }

  test("EvaluateArgs 0") {
    assert(evaluateArgs(Array("0"), defaultValue = 20) == 20, "evaluateArgs(\"0\", defaultValue = 20) should be 20")
  }

  test("gcd(45, 18)") {
    assert(gcd(45, 18) == 9, "gcd(45, 18) should be 9")
  }


  test("sumFuncResults: anonymous identity function") {
    assert(sumFuncResults(x => x, 10) == 55)
  }

  test("sumFuncResults: factorial function") {
    assert(sumFuncResults(factorial, 5) == 1 + 2 + 6 + 24 + 120)
  }

  test("sumFuncResultsParametrized with anonymous function") {
    assert(sumFuncResultsParametrized((x, y) => x + y, 5)(5, 5) == 50)
  }

  test("sumFuncResultsParametrized with mySum function - curried verion (mySum args passed directly as (i,i))") {
    for (i <- Seq(1, 8, 25, 57)) assert(sumFuncResultsParametrized(mySum, i)(23, 8) == (23 + 8) * i)
  }

  test("sumFuncResultsParametrized with lambda function with modulo - curried verion (mySum args passed directly as (i,i))") {
    for (i <- Seq(1, 8, 25, 57)) assert(sumFuncResultsParametrized((x, y) => x % y, i)(23, 8) == (23 % 8) * i)
  }

  test("sumFuncResultsParametrized with lambda function with diff - curried verion (mySum args passed directly as (i,i))") {
    for (i <- Seq(1, 8, 25, 57)) assert(sumFuncResultsParametrized((x, y) => x - y, i)(23, 8) == (23 - 8) * i)
  }

  
  // aggFuncResultsForRange
  test("aggFuncResultsForRange: aggregates custom function for custom range with custom aggr function!") {
    assert(aggFuncResultsForRange(x => x, (x, y) => x + y)(1, 5) == 1 + 2 + 3 + 4 + 5)
    assert(aggFuncResultsForRange(x => x * x, (x, y) => x + y)(1, 5) == 1 + 4 + 9 + 16 + 25)

    assert(aggFuncResultsForRange(x => x, (x, y) => x * y)(1, 5, 1) == 1 * 2 * 3 * 4 * 5)
    assert(aggFuncResultsForRange(x => x * x, (x, y) => x * y)(1, 5, 1) == 1 * 4 * 9 * 16 * 25)

    assert(aggFuncResultsForRange(x => x, (x, y) => x + y)(1, 5, 3) == 3 + 1 + 2 + 3 + 4 + 5)
    assert(aggFuncResultsForRange(x => x * x, (x, y) => x + y)(1, 5, 3) == 3 + 1 + 4 + 9 + 16 + 25)

    assert(aggFuncResultsForRange(x => x, (x, y) => x * y)(1, 5, 6) == 6 * 1 * 2 * 3 * 4 * 5)
    assert(aggFuncResultsForRange(x => x * x, (x, y) => x * y)(1, 5, 6) == 6 * 1 * 4 * 9 * 16 * 25)
  }

    test("backAggFuncResultsForRange: backward aggregation of custom function for custom range with custom aggr function!") {
    assert(backAggFuncResultsForRange(x => x, (x, y) => x + y)(1, 5) == 5 + 4 + 3 + 2 + 1)
    assert(backAggFuncResultsForRange(x => x * x, (x, y) => x + y)(1, 5) == 25 + 16 + 9 + 4 + 1)
    assert(backAggFuncResultsForRange(x => x, (x, y) => y - x)(1, 5) == 5 - 4 - 3 - 2 - 1)
    assert(backAggFuncResultsForRange(x => x * x, (x, y) => y - x)(1, 5) == 25 - 16 - 9 - 4 - 1)

    assert(backAggFuncResultsForRange(x => x, (x, y) => y / x)(1, 5) == 5 / 4 / 3 / 2 / 1)
    assert(backAggFuncResultsForRange(x => x * x, (x, y) => y - x)(1, 5) == 25 - 16 - 9 - 4 - 1)
    assert(backAggFuncResultsForRange(x => x * x, (x, y) => y % x)(1, 5) == 25 % 16 % 9 % 4 % 1)
  }

}
