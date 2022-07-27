//open.kattis.com/problems/greetings2

fun main() {
    val input = readLine()!!.split("")
    val newInput = input.count { it == "e" }*2
    val numE = "e".repeat(newInput)
    var newString = "h${numE}y".also {
        println(it)
    }
}
//heey --> heeeey