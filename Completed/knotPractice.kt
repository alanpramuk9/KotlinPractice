//https://open.kattis.com/problems/knotknowledge

fun main() {
    first()
    second()
    third()
}

//First Approach using Minus
fun first() {
    val numOfKnotsToLearn = readLine()!!
    val knotsNeeded = readLine()!!.split(" ").toList()
    val knotsLearned = readLine()!!.split(" ").toList()
    val remainingToLearn = knotsNeeded.minus(knotsLearned).joinToString(" ")
    println(remainingToLearn)
}

//Second Approach using filterNot
fun second() {
    val numOfKnotsToLearn = readLine()!!
    val knotsNeeded = readLine()!!.split(" ").toList()
    val knotsLearned = readLine()!!.split(" ").toList()
    knotsNeeded.filterNot {knotsLearned.contains(it)}.joinToString(" ").apply { println(this) }
}


//Third approach using function call
fun third() {
    val numOfKnotsToLearn = readLine()!!
    val knotsNeeded = readLine()!!.split(" ").toMutableSet()
    val knotsLearned = readLine()!!.split(" ").toSet()
    val duplicates = findDifference(knotsNeeded, knotsLearned)
    println(duplicates)
}
fun findDifference(first: MutableSet<String>, second: Set<String>): String {
    val diff = first
    diff.removeAll(second)
    return diff.joinToString(" ")
}


/*
4
1 2 4 3
4 2 3
-->
4


10 101 999 1
1 999 101
->
10
 */