package codeNotes

fun main() {
    val list = listOf(1, 2, 3)
    println(joinToString(list, "; ", "(", ")")) //(1; 2; 3)
    println("Kotlin".lastChar())
}

fun <T> joinToString(
    collection: Collection<T>, separator: String, prefix: String, postfix: String
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

/*
    Extension function is a simple thing: it’s a function that can be called as
    a member of a class but is defined outside of it.

    All you need to do is put the name of the class or interface that you’re extending
    before the name of the function you’re adding. This class name is called the
    receiver type; the value on which you’re calling the extension function is called the receiver object

    private or protected members of the class
 */

fun String.lastChar(): Char = this.get(this.length -1 )

//declaring joinToString() as an extension
fun <T> Collection<T>.joinToString2(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

