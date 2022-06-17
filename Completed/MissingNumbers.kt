package Completed

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/*
https://open.kattis.com/problems/missingnumbers
You enjoy your new job as a teacher of young children. It’s fun to see them learning to count, recognize letters, draw, and interact with the world.
One common problem you’ve noticed is that children often forget numbers when counting. For example, early on they might count “one, two, three, five, six.” You have to remind them about that “four” that they didn’t say. And as they get more proficient and clever, they may use the “quick” way of counting: “one, two, skip a few, ninety-nine, one hundred!”

Please write a program that can help you (and your students) identify the missing numbers when they are counting.

Input
The first line of input contains a single integer n, where 1<= n <=100 . Each of the next n lines contains one
number that the child recited. Each recited number is an integer between 1 and 200 (inclusive). They are listed
in increasing order, and there are no duplicates.

Output
If the child recited all the numbers between 1 and the last number they recited, then print "good job".
If the child missed any numbers between 1 and the last number they recited, then print those missing numbers
in increasing numeric order, one per line.
*/

class MissingNumbers {
    private fun basicMissingNumber(numbersTotal: Int, vararg number: Int): Any {
        val numbersCounted = mutableListOf<Int>()
        val numbersMissed = mutableListOf<Int>()

        for(x in number) numbersCounted.add(x) //add everything counted to list

        //if the number is not in numbersCounted, then add it to numbersMissed
        val lastNumber = numbersCounted[numbersCounted.size-1]
        for(x in 1 until lastNumber) {
            if(x !in numbersCounted) numbersMissed.add(x)
        }
        if (numbersMissed.isEmpty()) return "good job"
        return numbersMissed
    }

    @Test
    fun missingNumbersTest() {
        assertEquals(listOf(1,3,6,12), basicMissingNumber(9,2,4,5,7,8,9,10,11,13))
        assertEquals("good job", basicMissingNumber(5,1,2,3,4,5))
    }
}

