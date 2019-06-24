package com.demo

object functionExamples {

  def main(args: Array[String]): Unit = {

    def abs(x: Int) = if (x < 0) -x else x

    abs(-5)

    def fac(n: Int) = {
      var r = 1
      for (i <- 1 to n)
        r = r * i
      r
    }

    fac(5)

    def factorial(n: Int): Int = if (n <= 0) 1 else n * factorial(n - 1)
    //> factorial: (n: Int)Int
    factorial(5) //> res2: Int = 120

    def printName(left: String = "[", firstName: String, lastName: String, right: String = "]") {
      println(left + firstName + " " + lastName + right)
    }
    //> printName: (left: String, firstName: String, lastName: String, right: String
    //| )Unit
    printName(lastName = "Fisher", firstName = "Peggy")
    //> [Peggy Fisher]

    def sum(args: Int*) = {
      var result = 0
      for (arg <- args) result += arg
      result
    } //> sum: (args: Int*)Int
    sum(1, 2, 3, 4, 5) //> res3: Int = 15
  }
}