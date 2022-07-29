package completed

//https://open.kattis.com/problems/everywhere

//could very easily be optimized
fun main() {
    val testCases = readLine()!!.toInt()
    for(x in 1..testCases) {
        var numOfCities = readLine()!!.toInt()
        var cities = mutableListOf<String>()
        for(x in 0..numOfCities-1) {
            var city = readLine()!!.toString()
            cities.add(city)
        }
        println(cities.distinct().count())
        cities.clear()
    }
}

/*
2
7
saskatoon
toronto
winnipeg
toronto
vancouver
saskatoon
toronto
3
edmonton
edmonton
edmonton
->
4
1
 */