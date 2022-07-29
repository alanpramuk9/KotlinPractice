//https://open.kattis.com/problems/pyramids

fun main() {
    var blocks = readLine()!!.toInt()
    var levels = 1
    var result = 0
    for (i in 0 until blocks) {
        if (blocks > levels * levels) {
            blocks -= levels * levels
            levels += 2
        } else if (blocks == levels * levels) {
            result = i + 1
            break
        } else if (blocks < levels * levels) {
            result = i
            break
        }
    }
    println(result)
}

/*
83 -> 3
 */