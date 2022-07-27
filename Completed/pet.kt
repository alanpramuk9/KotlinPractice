//https://open.kattis.com/problems/pet

fun main() {
    var map = mutableMapOf<Int, Int>()
    for (i in 1..5) {
        var sum = readLine()!!.split(' ').map(String::toInt).sum()
        map.put(i, sum)
    }
    var maxEntry: Map.Entry<Int, Int>? = null
    //    val maxEntry = map.maxWith(Comparator { x, y -> x.value.compareTo(y.value)})
    for (entry in map.entries) {
        if (maxEntry == null || entry.value > maxEntry.value) maxEntry = entry
    }
    println("${maxEntry?.key} ${maxEntry?.value}")

}

/*
5 4 4 5
5 4 4 4
5 5 4 4
5 5 5 4
4 4 4 5
-> 4 19
 */