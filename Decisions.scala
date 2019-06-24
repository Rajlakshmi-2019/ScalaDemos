package com.demo


object Decisions {

  def main(args: Array[String]): Unit = {

    var today = "Tuesday" //> today  : String = Tuesday
    if (today == "Monday") println("It might rain")
    else println("It is not Monday, so it will not rain")

    var b = 4 //> b  : Int = 4
    var a = if (b < 0) -1 else 1 //> a  : Int = 1
    println(a) //> 1

    println(if (b < 0) "-" else if (b == 0) "0" else "+") //> +

  }
}