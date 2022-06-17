package InProgress

import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.test.assertEquals

/*
https://open.kattis.com/problems/datum
Write a program that, given a date in 2009, determines the day of week on that date.

Input
The first line contains two positive integers D (day) and M(month) separated by a space. The numbers will be a valid date in 2009 .

Output
Output the day of the week on day D of month M in 2009. The output should be one of the words “Monday”, “Tuesday”, “Wednesday”, “Thursday”, “Friday”, “Saturday” or “Sunday”.
 */

//TODO: Correctly retrieve the day of the week in `date` from LocalDate API
class Datum {
    private fun basicDatum(day: Int, month: Int): String {
        val date = LocalDate.parse("2009-$day-$month").dayOfWeek.toString().lowercase()
        val weekdays = arrayListOf(
            "sunday",
            "monday",
            "tuesday",
            "wednesday",
            "thursday",
            "friday",
            "saturday"
        )
        return weekdays[date.toInt()]
    }

    @Test
    fun testDatum() {
        assertEquals("saturday", basicDatum(10,10))
        assertEquals("saturday", basicDatum(17,1))
        assertEquals("friday", basicDatum(25,9))
    }
}