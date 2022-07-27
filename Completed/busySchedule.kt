import java.util.*

//https://open.kattis.com/problems/busyschedule

//NOT COMPLETE
fun main() {
    val scanner = Scanner(System.`in`)
    while (scanner.hasNextLine()) {
        val numOfAppointments = scanner.nextLine().toInt()
        if (numOfAppointments == 0) break
        val times = mutableListOf(numOfAppointments)
        for (i in 1 until numOfAppointments) {
            var time24hrs = 0
            val appointmentTime = scanner.nextLine().split(" ").toList()
            if (appointmentTime[1] == "p.m.") time24hrs = 12 * 60
            val hourAndMinute = appointmentTime[0].split(":").toList()
            time24hrs += hourAndMinute[0].toInt() * 60
            time24hrs += hourAndMinute[1].toInt()
            times.add(time24hrs)

            val hours = times[i] / 60
            val minutes = times[i] % 60
            if (hours < 12) {
                if (hours == 0) {
                    println("12:${minuteFormat(minutes)} a.m.")
                } else {
                    println("$hours:${minuteFormat(minutes)} a.m.")
                }
            } else if (hours == 12) {
                println("$hours:${minuteFormat(minutes)} p.m.")
            } else {
                println("${(hours - 12)}:${minuteFormat(minutes)} p.m.")
            }
            println()
        }
    }
}

fun minuteFormat(minutes: Int) = String.format("%02d", minutes)


/*
5
3:00 a.m.
3:00 p.m.
12:00 a.m.
11:59 a.m.
12:00 p.m.
3
3:30 p.m.
9:30 a.m.
3:30 p.m.
0
->
12:00 a.m.
3:00 a.m.
11:59 a.m.
12:00 p.m.
3:00 p.m.

9:30 a.m.
3:30 p.m.
3:30 p.m.
 */