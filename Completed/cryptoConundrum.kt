//https://open.kattis.com/problems/conundrum

fun main() {
    val code = readLine()!!
    var days = 0
    var x = 0
    while (x < code.length) {
        if (code[x] != 'P') days++
        if (code[x + 1] != 'E') days++
        if (code[x + 2] != 'R') days++
        x += 3
    }
    println(days)
}

//SECRET -> 4