import java.lang.System.`in`
import java.util.*

//https://open.kattis.com/problems/engineeringenglish

fun main() {
    val input = Scanner(`in`)
    val words: MutableSet<String> = mutableSetOf()
    while (input.hasNextLine()) {
        for (s in input.nextLine().split(" ").toList()) {
            if (words.contains(s.lowercase())) print(". ")
            else {
                print("$s ")
                words.add(s.lowercase())
            }
            println()
        }
    }
}

/*
Engineering will save the world from inefficiency
Inefficiency is a blight on the world and its
humanity
->
Engineering will save the world from inefficiency
. is a blight on . . and its
humanity
 */