//https://open.kattis.com/problems/lektira


fun main() {
    val input = readLine()!!
    println(findSmallestString(input))
}

fun findSmallestString(number: String): Any {
    var result = ""
    var start = 0

    for (i in 2 downTo 1) {
        var currentMinimum = "z"
        for (end in start until number.length - i){
            val current = number.reversedSubstring(start, end)
            if (current < currentMinimum) currentMinimum = current
        }
        result += currentMinimum
        start += currentMinimum.length
    }
    return result + number.reversedSubstring(start, number.length - 1)
}

fun String.reversedSubstring(start: Int, end: Int) = this.substring(start, end + 1).reversed()

//dcbagfekjih -> abcdefghijk
//mobitel --> bometil