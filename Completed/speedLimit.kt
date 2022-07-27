//https://open.kattis.com/problems/speedlimit

//Not Complete. Need to handle IndexOutOfBoundsException

fun main() {
    var line = readLine()!!.toInt()
    var indexOfNewSet = 0
    var index = 0
    var output = ""
    var dataSet = mutableListOf<Int>()

    while (line != -1) {
        if (index.equals(indexOfNewSet)) {
                indexOfNewSet += line + 1
                output += computeMiles(dataSet)
                dataSet = mutableListOf<Int>();

        } else {
            dataSet.add(line);
        }
        index += 1;
    }
    println(output);
}

fun computeMiles (dataSet: List<Int>?): String {
    var sumOfPrevTimeValues = 0;
    var totalMiles = 0;
    dataSet?.forEach {
        val (speed, hours) = it.toString().split(" ").map{it.toInt()}
        val time = hours - sumOfPrevTimeValues
        sumOfPrevTimeValues += time
        totalMiles += speed * time
    }

    return "$totalMiles miles"
}


/*
3
20 2
30 6
10 7
2
60 1
30 5
4
15 1
25 2
30 3
10 5
-1
-> 170 miles
180 miles
90 miles
 */
