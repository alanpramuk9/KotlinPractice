package Completed

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/*
https://open.kattis.com/problems/nodup
There is a game in which you try not to repeat a word while your opponent tries to see if you have repeated one.
    "THE RAIN IN SPAIN" has no repeats.
    "IN THE RAIN AND THE SNOW" repeats THE.
    "THE RAIN IN SPAIN IN THE PLAIN" repeats THE and IN.
Input
A line containing words separated by single spaces, where a word consists of one or more uppercase letters.
A line contains no more than 80 characters.

Output
The output is "yes" if no word is repeated, and "no" if one or more words repeat.
 */
class NoRepeats {
    private fun basicNoRepeats(inputSentence: String): String {
        if (inputSentence.length > 80) return "no"
        val sentenceSplit= inputSentence.split(" ")
        val sentenceCached = mutableListOf<String>()
        for(word in sentenceSplit) {
            if (sentenceCached.contains(word) && sentenceCached.isNotEmpty()) return "no"
            else (sentenceCached.add(word))
        }
        return "yes"

    }
    private fun intermediateNoRepears(inputSentence: String): String {
        val numOfWords = inputSentence.split(' ').size
        val uniqueWords = inputSentence.split(' ').toSet()
        if(numOfWords == uniqueWords.size)
            return "yes"
        else
            return "no"
    }
    @Test
    fun NoRepeatsTest() {
        assertEquals("yes", basicNoRepeats("THE RAIN IN SPAIN"))
        assertEquals("no", basicNoRepeats("IN THE RAIN AND THE SNOW"))
        assertEquals("no", basicNoRepeats("THE RAIN IN SPAIN IN THE PLAIN"))

        assertEquals("yes", intermediateNoRepears("THE RAIN IN SPAIN"))
        assertEquals("no", intermediateNoRepears("IN THE RAIN AND THE SNOW"))
        assertEquals("no", intermediateNoRepears("THE RAIN IN SPAIN IN THE PLAIN"))
    }
}