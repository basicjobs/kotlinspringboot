package com.storm.mogaapi


class Test
typealias S = String

fun String.getTestMsg(): String {
    return this.toString()
}

fun test(name: String = "test", age:Int): Unit {

}
fun test(vararg counts:Int): Unit {

}
fun sum(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a,b);
}


fun main(args: Array<String>) {
    //val func = ::sum
    //println(func({x, y -> x+y}, 10, 20))
    println("sdfdsf".getTestMsg())

}