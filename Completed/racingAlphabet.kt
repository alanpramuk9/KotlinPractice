import kotlin.math.abs
import kotlin.math.min

//https://open.kattis.com/problems/racingalphabet

var letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '"
fun main() {
        var numSentences = readLine()!!.toInt()
        while (numSentences-- > 0) {
            val sentence = readLine()!!
            var output = 0
            var cur = find(sentence[0])
            for (i in 1 until sentence.length) {
                val next = find(sentence[i])
                output += min(abs(cur - next), 28 - abs(cur - next))
                cur = next
            }
            println(output * Math.PI / 7 + sentence.length)
        }
}
fun find(c: Char): Int {
    for (i in 0..27) {
        if (c == letters[i]) {
            return i
        }
    }
    return 0
}

/*
3
WINNING ISN'T EVERYTHING IT'S THE ONLY THING
WINNERS DON'T WAIT FOR CHANCES THEY TAKE THEM
PAIN IS ONLY TEMPORARY BUT VICTORY IS FOREVER
->
187.6156641641
190.4108599662
193.1036536692
 */