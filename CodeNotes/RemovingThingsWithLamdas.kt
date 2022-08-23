package codeNotes

data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)

enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }

val log = listOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.MAC),
    SiteVisit("/login", 12.0, OS.WINDOWS),
    SiteVisit("/signup", 8.0, OS.IOS),
    SiteVisit("/", 16.3, OS.ANDROID)
)

fun List<SiteVisit>.averageDurationFor(os: OS) =
        filter { it.os == os }.map(SiteVisit::duration).average()

fun main(args: Array<String>) {
    println(log.averageDurationFor(OS.WINDOWS))
    println(log.averageDurationFor(OS.MAC))
}

/*
Part 2
 */

//data class SiteVisit(
//    val path: String,
//    val duration: Double,
//    val os: OS
//)
//
//enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }
//
//val log = listOf(
//    SiteVisit("/", 34.0, OS.WINDOWS),
//    SiteVisit("/", 22.0, OS.MAC),
//    SiteVisit("/login", 12.0, OS.WINDOWS),
//    SiteVisit("/signup", 8.0, OS.IOS),
//    SiteVisit("/", 16.3, OS.ANDROID)
//)
//
//val averageMobileDuration = log
//    .filter { it.os in setOf(OS.IOS, OS.ANDROID) }
//    .map(SiteVisit::duration)
//    .average()
//
//fun main(args: Array<String>) {
//    println(averageMobileDuration)
//}


/*
Part 3
 */

//data class SiteVisit(
//    val path: String,
//    val duration: Double,
//    val os: OS
//)
//
//enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }
//
//val log = listOf(
//    SiteVisit("/", 34.0, OS.WINDOWS),
//    SiteVisit("/", 22.0, OS.MAC),
//    SiteVisit("/login", 12.0, OS.WINDOWS),
//    SiteVisit("/signup", 8.0, OS.IOS),
//    SiteVisit("/", 16.3, OS.ANDROID)
//)
//
//fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
//        filter(predicate).map(SiteVisit::duration).average()
//
//fun main(args: Array<String>) {
//    println(log.averageDurationFor {
//        it.os in setOf(OS.ANDROID, OS.IOS) })
//    println(log.averageDurationFor {
//        it.os == OS.IOS && it.path == "/signup" })
//}