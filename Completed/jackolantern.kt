//https://open.kattis.com/problems/jackolanternjuxtaposition

fun main() {
    val line = readLine()!!.split(" ").map{it.toInt()}
    val numCombinations = line.reduce { sum: Int, currValue: Int ->
        sum * currValue
    }
    println(numCombinations)
}

//3 4 5 -> 60