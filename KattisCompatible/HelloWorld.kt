/*
    Basic hello world program to get https://open.kattis.com/ to resolve/compile Kotlin
    It includes a main function and System Reader very similar to Java

    Working with Chris to have all future problem sets be resolved via Kattis which has a more comprehensive test suite
    to compare against user's solution. Plan to have everything after 6/20/2022 in Kattis format :)
 */


fun main(args: Array<String>) {
    var line = readLine()
    var numberOfLoops = line?.toLong()
    var count = 1
    while (count <= numberOfLoops!!) {
        println("$count Abracadabra")
        count++
    }

}



