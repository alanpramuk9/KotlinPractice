//https://open.kattis.com/problems/countthevowels

fun main() {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    val count = readLine()!!
        .split("")
        .map{it.count { it in vowels }}
        .sum()
        println(count)
}

/*
This is a test.
-> 4
 */