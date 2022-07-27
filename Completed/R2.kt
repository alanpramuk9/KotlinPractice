import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/*
Problem Set from https://open.kattis.com/
The number S is called the mean of two numbers R1 and R2 if S is equal to (R1 + R2)/2 . Mirko’s birthday present for Slavko was two integers
R1 and R2. Slavko promptly calculated their mean which also happened to be an integer but then lost R2! Help Slavko restore R2 .

Input
The first and only line of input contains two integers R1 and S1, both between -1000 and 1000 .
Output R2 on a single line.
 */

//this problem set is super basic and will be deleted as more problems are worked from the FutureProblemSets.md file
class R2 {
    private fun basicR2(R1: Int, S1: Int): Int {
        //R2 = 2(S1) - R1
        return (2 * S1) - R1
    }

    @Test
    fun R2Test() {
        assertEquals(19, basicR2(11,15))
        assertEquals(2, basicR2(4,3))
    }
}