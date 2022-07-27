import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File
import java.util.*

/**
 * Chris Hebert Implemntation for getting started with Kattis
 * Problem: https://open.kattis.com/problems/findingana
 */

fun main() {
    val inputFile = File("../../test/kotlin/input/anA").readLines()
    println(inputFile)
//    val scanner = Scanner(System.`in`)
//    val ret = findingAUtil(scanner)
//    println(ret)
}

fun anotherMain() {
    val inputFile = File("kotlin/Input/anA").readLines()
    println(inputFile)


}

fun findingAUtil(scanner: Scanner): String {
    var ret = ""
    while (scanner.hasNextLine()) {
        val line = scanner.nextLine()
        if (line.isBlank()) break
        val firstA = line.indexOf("a")
        ret += line.substring(firstA) + "\n"
    }
    return ret
}

class FindingAnAAdvancedTest {
    @Test
    fun test1() {
        assertEquals("aana\n", findingAUtil(Scanner("banana\n".byteInputStream())), )
        assertEquals("apple\n", findingAUtil(Scanner("apple\n".byteInputStream())), )
        assertEquals("ank\n", findingAUtil(Scanner("prank\n".byteInputStream())), )
    }
    @Test
    fun test3() {
        assertEquals("anana\napple\nank\n", findingAUtil(Scanner("banana\napple\nprank\n".byteInputStream())), )
    }

    @Test
    fun test2() {
        assertEquals("WRONG EXPECTED\n", findingAUtil(Scanner("banana\n".byteInputStream())), )
    }
}