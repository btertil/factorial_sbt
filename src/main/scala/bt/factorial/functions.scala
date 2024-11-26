package bt.factorial

import scala.annotation.tailrec

object functions {

  private def redString(x: String): fansi.Str = fansi.Color.Red(x)
  private def yellowString(x: String): fansi.Str = fansi.Color.Yellow(x)

  def timeIt[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block
    val t1 = System.nanoTime()

    println(s"Executed in ${BigDecimal((t1 - t0).toDouble / 1000000000).setScale(4, BigDecimal.RoundingMode.HALF_DOWN)} seconds.")
    result
  }

  def mySum(x: Int, y: Int): Int = x + y

  def factorial(x: Int): Long = {
    @tailrec
    def iterate(acc: Long, step: Int): Long = {
      if (step == 1) acc else iterate(acc * step, step - 1)
    }
    iterate(1, x)
  }

  def evaluateArgs(x: Array[String], defaultValue: Int = 8, maxVal: Int = 20): Int = {

    def factorialArgErrorMsg(): Unit =
      println(redString(s"ERROR! Factorial in this system can be calculated only for natural numbers <= 20, asked for '${x(0)}'"))

    def defaultInsteadMsg(): Unit =
      println(yellowString(s"WARNING! Using maximum allowed value $defaultValue instead"))

    if (x.isEmpty) defaultValue else {
      try {
        val extracted = x(0).toInt
        if (extracted <= maxVal) extracted else {
          factorialArgErrorMsg()
          defaultInsteadMsg()
          defaultValue
        }
      } catch {
        case _: java.lang.NumberFormatException =>
          factorialArgErrorMsg()
          defaultInsteadMsg()
          defaultValue
      }
    }
  }

  @tailrec
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def sumF(f: Int => Long, limit: Int): Long = { for (i <- 1 to limit) yield f(i) }.sum
  
}