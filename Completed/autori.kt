//https://open.kattis.com/problems/autori

fun main() {
    val names = readLine()!!
    fun longNamesToShort(names: String): String {
        return names.split('-').joinToString("") {
            it.first().toString()
        }
    }
    println(longNamesToShort(names))
}

//assertEquals("KMP", longNamesToShort("Knuth-Morris-Pratt"))
//assertEquals("MS", longNamesToShort("Mirko-Slavko"))
//assertEquals("PP", longNamesToShort("Pasko-Patak"))