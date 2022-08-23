//https://open.kattis.com/problems/pokerhand

fun main() {
    firstApproach()
    idiomaticApproach()
}

fun firstApproach() {
    val pokerHand = readLine()!!.split(" ")
    val mostCardsK = mutableMapOf<Char, Int>()
    for(strength in pokerHand) {
        val k = strength[0]
        mostCardsK.putIfAbsent(k, 0)
        mostCardsK[k] = mostCardsK[k]!! + 1
    }
    val x = mostCardsK.maxBy { it.value }!!.value
    println(x)
}

fun idiomaticApproach() {
    readLine()!!.split(" ").groupingBy { it.first() }.eachCount().maxBy { it.value }.value.also {
        println(it)
    }
}

