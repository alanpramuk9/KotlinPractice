//https://open.kattis.com/problems/overdraft

fun main() {
    val input = readLine()!!.toInt()
    var bankBalance = 0
    var minBalanceAtBeginning: Int = 0
    for(number in 0..input-1) {
        val nextNumber = readLine()!!.toInt()
        bankBalance += nextNumber
        if(bankBalance < minBalanceAtBeginning) {
            minBalanceAtBeginning = bankBalance
        }
    }
    println(abs(minBalanceAtBeginning))
}