//https://open.kattis.com/problems/magictrick

//First pass
//fun main() {
//    val input = readLine()!!
//    var isRepeated = false;
//
//    for (i in 0 until input.length) {
//        for (j in i + 1 until input.length) {
//            if (input[i] == input[j]) {
//                isRepeated = true
//                break
//            }
//        }
//    }
//    if (!isRepeated) {
//        println("1");
//    } else {
//        println("0");
//    }
//}

//kotlin-istic approach
fun main() {
    val input = readLine()!!

    val dupes = fun(text: String): Int {
        return input
            .groupingBy { it }.eachCount()
            .count { it.value > 1 }
    }
    if(dupes(input) > 0) println(0)
    else println(1)
}

//Could also use a HashMap counting the times a character is repeated
//fun hashMap() {
//    val input = readLine()!!
//    val map = hashMapOf<Char, Int>()
//    for (i in input) {
//        if (map.keys.contains(i)) {
//            var x = map[i]
//            map[i] = 1 + x!!
//        } else {
//            map[i] = 1
//        }
//    }
//    //if map.values > 1 println(0)
//}


/*
robust -> 1
icpc -> 0
 */
