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


}
