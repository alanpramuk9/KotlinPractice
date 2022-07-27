//https://open.kattis.com/problems/alphabet

fun main() {
    val line = readLine()!!
    var whitespace = 0.0
    var lowercase = 0.0
    var uppercase = 0.0
    var symbols = 0.0
    for (x in line.indices) {
        when {
            line[x] in 'a'..'z'-> lowercase++
            line[x] in 'A'..'Z' -> uppercase++
            line[x] == '_' -> whitespace++
            else -> symbols++
        }
    }
    val number = line.length.toDouble()
    println(whitespace / number)
    println(lowercase / number)
    println(uppercase / number)
    println(symbols / number)
}


//Welcome_NWERC_participants!