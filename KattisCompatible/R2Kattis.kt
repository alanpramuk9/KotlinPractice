package KattisCompleted

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/*
Problem Set from https://open.kattis.com/
The number S is called the mean of two numbers R1 and Completed.R2 if S is equal to (R1 + Completed.R2)/2 . Mirko’s birthday present for Slavko was two integers
R1 and Completed.R2. Slavko promptly calculated their mean which also happened to be an integer but then lost Completed.R2! Help Slavko restore Completed.R2 .

Input
The first and only line of input contains two integers R1 and S1, both between -1000 and 1000 .
Output Completed.R2 on a single line.
 */

//this problem set is super basic and will be deleted as more problems are worked from the FutureProblemSets.md file
class R2Kattis {
    private fun basicR2(R1: Int, S1: Int): Int {

    }

    fun main() {
        var line = readLine()
            val twoWords= line!!.split(' ').map { it.toInt() }
            val (r1, s1) = twoWords
            val r2 = (2 * s1) - r1
                print(r2)
    }

    @Test
    fun R2Test() {
        assertEquals(19, basicR2(11,15))
        assertEquals(2, basicR2(4,3))
    }
}
