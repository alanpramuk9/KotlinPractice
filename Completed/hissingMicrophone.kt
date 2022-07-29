//https://open.kattis.com/problems/hissingmicrophone

fun main() {
    val input = readLine()!!.toCharArray()
    val character: Char = 's'
    var isCharRepeated = false
    for (x in 0..input.size - 2) {
        if (input[x] == character && input[x + 1] == character) {
            isCharRepeated = true
            break
        }
    }
    if(isCharRepeated) println("hiss")
    else println("no hiss")
}

/*
amiss -> hiss
octopuses --> no hiss
 */