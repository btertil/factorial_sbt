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

}
