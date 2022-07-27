//https://open.kattis.com/problems/jumbojavelin

fun main () {
        var totalInput = mutableListOf<Int>()
        var line: String? = readLine()
        while (line != null && line.isNotBlank()) {
            totalInput.add(line.toInt())
            line = readLine()
        }
        var sum: Int = 0
        for(x in 1..totalInput.size-1) {
            sum += totalInput[x]
        }
        val totalSum = sum - (totalInput[0] -1)
        println(totalSum)
}


//4 21 34 18 9 -> 79
