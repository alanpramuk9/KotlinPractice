package codeNotes

/* Using a Data Class to store info */
data class Person(val name: String,
                  val age: Int? = null)

fun main() {
    val persons = listOf(Person("Alice"),
                         Person("Bob", age = 29))

    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")

    println(isLetter2('q'))
    println(isNotDigit2('x'))

    lookForAlice(people)

}
// The oldest is: Person(name=Bob, age=29)

/* using IN check */
internal fun isLetter2(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
internal fun isNotDigit2(c: Char) = c !in '0'..'9'

/* return in lambdas */
data class Human(val name: String, val age: Int)

val people = listOf(Human("Alice", 29), Human("Bob", 31))

fun lookForAlice(people: List<Human>) {
    people.forEach {
        if (it.name == "Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}
