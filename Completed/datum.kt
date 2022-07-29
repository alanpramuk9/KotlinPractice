package completed

import java.util.*
import java.util.Calendar.DAY_OF_WEEK


fun main() {
    val (day, month) = readLine()!!.split(" ").map{it.toInt()}
    //how Calendar maps DAY_OF_WEEK to day
    val week = arrayOf(" ", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    val calendarDate = Calendar.getInstance()
    calendarDate.set(2009, month - 1, day)
    val intOfWeek = calendarDate.get(DAY_OF_WEEK)
    println(week[intOfWeek])
}


/*
1 1 -> Thursday
17 1 -> Saturday
25 9 -> Friday
 */