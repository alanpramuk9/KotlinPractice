//https://open.kattis.com/problems/trik

fun main() {
    var ball = 0;
    var moves = readLine()!!.split("").drop(1).dropLast(1)
    println(moves)
    for (x in 0 until moves.size) {
        if (moves[x].equals("A") && ball != 2) {
            ball = 1 - ball
        }
        if (moves[x].equals("B") && ball != 0)
            ball = -ball + 3

        if (moves[x].equals("C") && ball != 1)
            ball = -ball + 2
    }
    println(ball + 1);
}

/*
CBABCACCC -> 3
AB -> 3
 */