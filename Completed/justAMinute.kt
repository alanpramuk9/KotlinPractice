//https://open.kattis.com/problems/justaminute

//Not Currently working

val total = mutableListOf<Float>()
fun main() {
    val numObservations = readLine()!!.toInt()
    for(x in 0 until numObservations) {
        val (minutes, seconds) = readLine()!!.split(" ").map{it.toFloat()}
        var relativeMinutes = minutes * 60
        difference(seconds, relativeMinutes)
    }
    val output = calculateAverage(total)
//    println(".%6d".format(output))
    println(output)
}

fun difference(seconds: Float, relativeMinute: Float) {
    if(relativeMinute >= seconds) println("measurement error")
    val percent = ((seconds - relativeMinute) / relativeMinute)*100
    total.add(percent)
}

fun calculateAverage(listTotal: MutableList<Float>) : Float = listTotal.average().toFloat()


/*
1
1 61
->
1.016666667


3
5 560
10 600
2 264
->
1.396078431
 */