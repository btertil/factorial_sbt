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

  test("gcd(45, 18)") {
    assert(gcd(45, 18) == 9, "gcd(45, 18) should be 5")
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
    for (i <- Seq(1, 8, 25, 57)) assert(sumFuncResultsParametrized(mySum, i)(i, i) == (i + i) * i)
  }

}
