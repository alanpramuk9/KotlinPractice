package designPatterns

//import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

/*
Behavioral: how your object function inside code. how strategy impacts strcuture. how o
bjects communicate and relate
 */

object NetworkDriver {
    init {
        println("Initializing: $this")
    }

    fun log(): NetworkDriver = apply { println("Network driver: $this") }
}

class SingletonTest {
    @Test
    fun testSingleton() {
        println("Start")
        val networkDriver1 = NetworkDriver.log()
        val networkDriver2 = NetworkDriver.log()

        //Assertions.assertThat(networkDriver1).isSameAs(NetworkDriver)
       // assertThat(networkDriver2).isSameAs(NetworkDriver)
    }
}

/* another singleton  */
fun main() {
    Logger.log("Hello World")
}
object Logger {
    init {
        println("I was accessed for the first time")
        // Initialization logic
    }

    fun log(message: String) {
        println("Logging $message")
    }
}