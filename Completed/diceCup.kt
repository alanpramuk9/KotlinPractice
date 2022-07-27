//https://open.kattis.com/problems/dicecup
import kotlin.math.max

fun main() {
    val (firstDie, secondDie) = readLine()!!.split(" ").map { it.toInt() }
    val map = HashMap<Int, Int>()
    for (i in 1..firstDie) {
        for (j in 1..secondDie) {
            map[i + j] = if (map.containsKey(i + j)) map[i + j]!! + 1 else 1
        }
    }
    var maxNum = 0
    map.keys.forEach { maxNum = max(maxNum, map[it]!!) }
    map.keys.forEach { x -> if (map[x] == maxNum) println(x) }

}