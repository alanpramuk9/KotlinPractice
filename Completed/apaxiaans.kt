//https://open.kattis.com/problems/apaxiaaans

fun main() {
    val word = readLine()!!.toString()
    println(currateWord((word)))
}

fun currateWord(word: String): String? {
    var curratedWord: String? = ""
    (0 until word.length - 1)
        .forEach { index ->
            if (word[index] != word[index + 1]) {
                curratedWord += word[index]
            }
        }
    curratedWord += word.last()
    return curratedWord
}

//roooooobertapalaxxxxios -> robertapalaxios