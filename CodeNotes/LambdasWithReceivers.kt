package codeNotes

/*part 1 */
fun buildString(
    builderAction: (StringBuilder) -> Unit
): String {
    val sb = StringBuilder()
    builderAction(sb)
    return sb.toString()
}

fun main(args: Array<String>) {
    val s = buildString {
        it.append("Hello, ")
        it.append("World!")
    }
    println(s)
}

/*part 2 */
//fun buildString(
//    builderAction: StringBuilder.() -> Unit
//) : String {
//    val sb = StringBuilder()
//    sb.builderAction()
//    return sb.toString()
//}
//
//fun main(args: Array<String>) {
//    val s = buildString {
//        this.append("Hello, ")
//        append("World!")
//    }
//    println(s)
//}

/* part 3 */
//val appendExcl : StringBuilder.() -> Unit =
//        { this.append("!") }
//
//fun main(args: Array<String>) {
//    val stringBuilder = StringBuilder("Hi")
//    stringBuilder.appendExcl()
//    println(stringBuilder)
//    println(buildString(appendExcl))
//}

/* part 4 */
//fun main(args: Array<String>) {
//    val map = mutableMapOf(1 to "one")
//    map.apply { this[2] = "two"}
//    with (map) { this[3] = "three" }
//    println(map)
//}