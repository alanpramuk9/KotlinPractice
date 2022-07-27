//https://open.kattis.com/problems/detaileddifferences

fun main() {
    val numOfCases = readLine()!!.toInt()
    val arrayFirstCases = mutableListOf<String>()
    val arraySecondCases = mutableListOf<String>()

    (1..numOfCases).forEach { i ->
        arrayFirstCases.add(readLine()!!)
        arraySecondCases.add(readLine()!!)
    }

    for (i in 0 until numOfCases) {
        var delimeters = ""
        for (j in 0 until arrayFirstCases[i].length) {
            if (arrayFirstCases[i][j] == arraySecondCases[i][j]) {
                delimeters += "."
            } else {
                delimeters += "*"
            }
        }
        println(buildString {
            append("${arrayFirstCases[i]}\n")
            append("${arraySecondCases[i]}\n")
            append("$delimeters\n")
        })
    }
}

/*
3
ATCCGCTTAGAGGGATT
GTCCGTTTAGAAGGTTT
abcdefghijklmnopqrstuvwxyz
bcdefghijklmnopqrstuvwxyza
abcdefghijklmnopqrstuvwxyz0123456789
abcdefghijklmnopqrstuvwxyz0123456789
->
ATCCGCTTAGAGGGATT
GTCCGTTTAGAAGGTTT
*....*.....*..*..

abcdefghijklmnopqrstuvwxyz
bcdefghijklmnopqrstuvwxyza
**************************

abcdefghijklmnopqrstuvwxyz0123456789
abcdefghijklmnopqrstuvwxyz0123456789
....................................
 */