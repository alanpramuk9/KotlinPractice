package NotStarted

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/*
Problem Set from https://open.kattis.com/
Input
The first line contains the three positive integers A, B and C, not necessarily in that order.
The three numbers will be less than or equal to 100 .
The second line contains three uppercase letters ’A’, ’B’ and ’C’ (with no spaces between them) representing the desired order.

Output A, B and C in the desired order on a single line, separated by single spaces.
 */
class ABC {
    private fun basicABC(A: Int, B: Int, C: Int, desiredOrder: String) {
        val numberOrder = mutableListOf(A, B, C)
        println(numberOrder)
    }


//    @Test
//    private fun ABCTest() {
//        assertEquals(listOf(1,3,5), basicABC(1,5,3,"NotStarted.ABC"))
//        assertEquals(listOf(6,2,4), basicABC(6,4,2,"CAB"))
//    }
}