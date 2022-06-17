package InProgress

/*
https://open.kattis.com/problems/pokerhand
You are given a five-card hand drawn from a standard 52-card deck. The strength of your hand is the maximum value k such that there are k
cards in your hand that have the same rank. Compute the strength of your hand.

Input
The input will consist of a single line, with five two-character strings separated by spaces.
The first character in each string will be the rank of the card, and will be one of A23456789TJQK.
The second character in the string will be the suit of the card, and will be one of CDHS.
You may assume all the strings are distinct.

Output
Output, on a single line, the strength of your hand.
 */

//TODO: Filter through list to get the Max Count of ranks (A23456789TJQK)
class Poker {
    fun basicPoker(pokerHand: String): Int {
        //TLDR: Suit doesn't matter. Determine how many duplicate ranks you have to get the max value k
        val strength = pokerHand
            .replace("C", "")
            .replace("D", "")
            .replace("H", "")
            .replace("S", "")
            .split(" ")
        return 0
    }

 //   @Test
//    fun basicPoker(){
//        assertEquals(4, "AC AD AH AS KD")
//        assertEquals(3, "2C 4D 4H 2D 2H")
//        assertEquals(1, "AH 2H 3H 4H 5H")
//    }
}