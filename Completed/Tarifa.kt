package Completed

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/*
KATTIS.COM PROBLEM DEFINITION
Pero has negotiated a Very Good data plan with his internet provider. The provider will let Pero use up  megabytes to surf the internet per month.
Each megabyte that he doesn’t spend in that month gets transferred to the next month and can still be spent. Of course, Pero can only spend the megabytes he actually has.
If we know how much megabytes Pero has spent in each of the first  months of using the plan, determine how many megabytes Pero will have available in the  month of using the plan.

Input
The first line of input contains the integer  (). The second line of input contains the integer  (). Each of the following  lines contains an integer  (), the number
of megabytes spent in each of the first  months of using the plan. Numbers  will be such that Pero will never use more megabytes than he actually has.

Output
The first and only line of output must contain the required value from the task.
 */
class Tarifa {
    /*
        X[mbsGiven] = Megabytes per month by provider, N[months] = Number of months,
        Pi[mbsUsed] = Amount of data used per month so far, Return: How many megabytes available N + 1 months of using plan
     */
    private fun basicTarifa(mbsGiven : Int, months : Int, vararg mbsUsed: Int): Int {
        var mbsTotal = mbsGiven * (months + 1)
        var mbsUsedList = mutableListOf<Int>()
        for(x in mbsUsed) {
            mbsUsedList.add(x)
        }
        val mbsUsedTotal = mbsUsedList.reduce { accumulation, value -> accumulation + value  }
        return mbsTotal - mbsUsedTotal
    }

    @Test
    fun TarifaTest() {
        assertEquals(28, basicTarifa(10, 3, 4, 6, 2))
        assertEquals(16, basicTarifa(10, 3, 10, 2, 12))
        assertEquals(15, basicTarifa(15, 3, 15, 10, 20))
    }
}