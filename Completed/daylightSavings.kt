//https://open.kattis.com/problems/dst

fun main() {
    var numCases = readLine()!!.toInt()
    while (numCases-- > 0) {
        val line = readLine()!!.split(" ")
        var roll= line[0]
        var (change, hours, mins) = line.takeLast(3).map { it.toInt() }
        var count = 0
        if (roll == "F") {
            mins += change
            while (mins >= 60) {
                mins -= 60
                count++
            }
            hours += count
            hours %= 24
        } else {
            mins -= change
            while (mins < 0) {
                mins += 60
                count++
            }
            hours -= count
            if (hours < 0) hours += 24
        }
        println("$hours $mins")
    }
}

/*
7
B 45 9 0
F 20 23 50
B 30 0 5
B 60 2 0
F 0 12 0
F 15 17 45
B 0 0 0
->
8 15
0 10
23 35
1 0
12 0
18 0
0 0
 */