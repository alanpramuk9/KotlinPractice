//https://open.kattis.com/problems/oddities

fun main() {
    val line = readLine()!!.toInt()
    val list = mutableListOf<String>()
    for (i in 1..line) {
        val x = readLine()!!.toInt()
        when {
            x % 2 == 0 -> list.add("$x is even")
            else -> list.add("$x is odd")
        }
    }
    //mixing it up with a foreach this time
    (1..line).forEach { i ->
        println(list[i-1])
    }
}