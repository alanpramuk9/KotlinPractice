//https://open.kattis.com/problems/isithalloween

//lots of ways to do it with `when`
fun main() {
    val input = readLine()!!
    val halloween = "OCT 31"
    val christmas = "DEC 25"
    when(input) {
        halloween, christmas -> println("yup")
        else -> println("nope")
    }
}

private fun main2() {
    val input = readLine()!!
    val holidays = listOf<String>("OCT 31", "DEC 25")
    when(input) {
        holidays.find {it -> it.equals(input)} -> println("yup")
        else -> println("nope")
    }
}

private fun main3() {
    val input = readLine()!!
    val holidays = listOf<String>("OCT 31", "DEC 25")
    when(input) {
        in holidays -> println("yup")
        else -> println("nope")
    }
}

private fun main4() {
    val input = readLine()!!
    when(input) {
        "OCT 31", "DEC 25" -> println("yup")
        else -> println("nope")
    }
}

private fun main5() {
    val input = readLine()!!
    if (input == "OCT 31" || input == "DEC 25") {
        println("yup")
    } else {
        println("nope")
    }
}

//OCT 31 -> yup
//JUN 24 -> nope



