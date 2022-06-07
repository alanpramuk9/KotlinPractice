
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FibonacciTest {

    @Test
    fun test() {
//        println(fibonacciRecursive(100))
//        assertEquals(
//            fibonacci(100).size,
//            100
//        )


//        assertEquals(1,fibonacciRecursive(0))
//        assertEquals(1,fibonacciRecursive(1))
//        assertEquals(2,fibonacciRecursive(2))
//        assertEquals(3,fibonacciRecursive(3))
//        assertEquals(5,fibonacciRecursive(4))
//        assertEquals(8,fibonacciRecursive(5))
//        assertEquals(13,fibonacciRecursive(6))
//        assertEquals(21,fibonacciRecursive(7))

        assertEquals(21, fibonacci(9))
        assertEquals(13, fibonacci(8))
        assertEquals(8, fibonacci(7))
        assertEquals(13, fibonacci(8))
        assertEquals(34, fibonacci(10))

    }

    /*
    Cache Solution
     */
    var fibonacciTable = mutableListOf<Long>(0,1)

    private fun fibonacci(numberOfValuesToReturn: Int): Long {
        var count =1
        var numberOn = 0L
        var nextNumber = 1L
        if (fibonacciTable.size >= numberOfValuesToReturn) {
            return fibonacciTable[numberOfValuesToReturn -1]
        }
        else {
            nextNumber = fibonacciTable[fibonacciTable.size - 1]
            numberOn = fibonacciTable[fibonacciTable.size - 2]
            count = fibonacciTable.size
        }
        while (count < numberOfValuesToReturn) {
            var sum : Long = numberOn + nextNumber;
            numberOn = nextNumber
            nextNumber = sum
            count++
            fibonacciTable.add(sum)
        }
        return nextNumber
    }

    /*
    Basic Approach
    */

//    private fun fibonacci(numberOfValuesToReturn: Int): Long {
//        var count =1
////        var fibonacciList = mutableListOf<Long>(1)
//        var numberOn : Long = 0
//        var nextNumber = 1L
//        while (count < numberOfValuesToReturn) {
//            var sum : Long = numberOn + nextNumber;
////            fibonacciList.add(sum)
//            numberOn = nextNumber
//            nextNumber = sum
//            count++
//        }
//        return nextNumber
////        return fibonacciList //
//    }

    private fun fibonacciRecursive(numberOfValuesToReturn: Int) : Long {
        if(numberOfValuesToReturn <= 1)
            return 1
        return fibonacciRecursive( numberOfValuesToReturn -1) + fibonacciRecursive(numberOfValuesToReturn -2)
    }

}