package codeNotes

import codeNotes.Color2.YELLOW
import java.util.*

//first-class functions: store them as variables, pass them as params, return them from funcs

//fun findAlice() = findPerson { it.name == "Alice"}
//fun findBob() = findPerson { it.name == "Bob"}

fun main() {
    val rectangle = Rectangle(4, 3)
    //println(rectangle)
    //println(Color.BLUE.rgb())
    //val x = getMnemonic(Color.BLUE)
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    val people = listOf(Someone("Alice", 27), Someone("Bob", 31))
    println(people.all(canBeInClub27))
}

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

//declaring an enum class with properties
enum class Color(
    val r: Int, val g: Int, val b: Int
) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}


enum class Color2 {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getMnemonic(color: Color2) =
        when (color) {
            Color2.RED -> "Richard"
            Color2.ORANGE -> "Of"
            YELLOW -> "York"
            Color2.GREEN -> "Gave"
            Color2.BLUE -> "Battle"
            Color2.INDIGO -> "In"
            Color2.VIOLET -> "Vain"
        }

fun mix(c1: Color2, c2: Color2) =
        when (setOf(c1, c2)) {
            setOf(Color2.RED, YELLOW) -> Color2.ORANGE
            setOf(YELLOW, Color2.BLUE) -> Color2.GREEN
            setOf(Color2.BLUE, Color2.VIOLET) -> Color2.INDIGO
            else -> throw Exception("Dirty color")
        }

/*
Note that the Expr interface doesn’t declare any methods; it’s used as a marker interface to provide a
 common type for different kinds of expressions.
 */

interface Expr
class Num(val value: Int) : Expr
class Sum(val leftExpr: Expr, val rightExpr: Expr) :
    Expr //The argument of a Sum operation can be any Expr: either Num or another Sum

//The Expr interface has two implementations, so you have to try two options
// in order to evaluate a result value for an expression:
fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.leftExpr) + eval(e.rightExpr)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun eval2(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> eval(e.leftExpr) + eval(e.rightExpr)
    else -> throw IllegalArgumentException("Unknown expression")
}


fun iteratingOverMaps() {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = c.code.toString(radix = 2)
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

//checking membership using in
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'


//If you have any class that supports comparing instances (by implementing the kotlin.Comparable interface), you can create ranges of objects of that type. If you have such a range, you can’t enumerate all objects in the range.

data class Someone(val name: String, val age: Int)
val canBeInClub27 = { p: Someone -> p.age <= 27 }



