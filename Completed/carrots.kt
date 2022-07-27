package completed//https://open.kattis.com/problems/carrots


fun main() {
    val (numContestants, numSolved) = readLine()!!.split(' ').map(String::toInt)
    print(numSolved)
}
private fun main2() {
    val (_, numSolved) = readLine()!!.split(' ').map(String::toInt)
    print(numSolved)
}

/* 2 1
 carrots?
bunnies
-> 1
 */