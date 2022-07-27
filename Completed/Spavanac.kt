//Problem: https://open.kattis.com/problems/spavanac

fun main() {
    val minsSetBack = 45
    val minsSetBackToOneHourDiff = 60 - minsSetBack
    val (inputHours, inputMinutes) = readLine()!!.split(" ").map { it.toInt() }
    var hoursOffset = 0
    var minutesOffset = -45
    var outputHours = 0
    var outputMinutes = 0

    if (inputMinutes < 45) {
        minutesOffset = minsSetBackToOneHourDiff
        if (inputHours == 0) {
            hoursOffset = 23
        } else {
            hoursOffset = -1
        }
    }
    outputHours = inputHours + hoursOffset
    outputMinutes = inputMinutes + minutesOffset

    println("${outputHours} ${outputMinutes}")
}


fun secondTry() {
    var (hours, minutes) = readLine()!!.split(" ").map { it.toInt() }
    minutes -= 45
    if (minutes < 0) {
        hours -= 1
        minutes += 60
    }
    if (hours < 0) hours = 23
    println("$hours $minutes")
}

/*
10 10
-> 9 25

0 30
-> 23 45
 */