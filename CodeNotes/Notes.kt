/*
mycall invokes the print function by passing the string as a parameter. While invoking
the print(), it would create an additional call and increases memory overhead.
*/

fun higherfunc( str : String, mycall :(String)-> Unit) {
    // inovkes the print() by passing the st ring str
    mycall(str)
}

// main function
fun main(args: Array<String>) {
    print("GeeskforGeeks: ")
    higherfunc("A Computer Science portal for Geeks",::print)
}

//lambda function

//var lambda = { println("Lambda expression")
//    return }      // normally lambda expression does not allow return
//// statement, so gives compile time error
//fun main(args: Array<String>) {
//    lambda()
//}

/*
Reified Type Parameters
Sometimes we need to access the type of parameter passed during the call. We have to simply pass
 the parameter at the time of function calling and we can retrieve the type of the parameter using a reified modifier.
*/

fun main3(args: Array<String>) {
    genericFunc<String>()
}

inline fun <reified T> genericFunc() {
    print(T::class)
}


/*
Higher Order functions:

Kotlin functions can be stored in variables and data structures, passed as
 arguments to and returned from other higher-order functions.

In Kotlin, a function which can accept a function as parameter or can return a function is called Higher-Order function.
    -Frequently, lambdas are passed as parameter in Kotlin functions for the convenience.
        There are two types of lambda expression which can be passed-
            Lambda expression which return Unit
            Lambda expression which return any of the value integer,string etc
 */

/* Kotlin program of lambda expression which returns Unit-
    lambda expression
        -lmbd is local name for the receiving lambda parameter.
        -() represents that the function does not accept any arguments.
        -  Unit represents that function does not return any value.
        */

var lambda = {println("GeeksforGeeks: A Computer Science portal for Geeks") }
// higher-order function
fun higherfunc2( lmbd: () -> Unit ) {	 // accepting lambda as parameter
    lmbd()							 //invokes lambda expression
}
fun main4(args: Array<String>) {
//invoke higher-order function
    higherfunc2(lambda)				 // passing lambda as parameter
}

//Kotlin program of lambda expression which returns Integer value –
fun whatever() {
    // lambda expression
    var lambda = {a: Int , b: Int -> a + b }
    // higher order function
    fun higherfunc( lmbd: (Int, Int) -> Int) {      // accepting lambda as parameter

        var result = lmbd(2,4)    // invokes the lambda expression by passing parameters
        println("The sum of two numbers is: $result")
    }

    fun main(args: Array<String>) {
        higherfunc(lambda)           //passing lambda as parameter
    }
}

// regular function definition
//Kotlin program of passing function which returns integer value-
fun lamba4() {
    fun add(a: Int, b: Int): Int {
        var sum = a + b
        return sum
    }

    // higher-order function definition
    fun higherfunc(addfunc: (Int, Int) -> Int) {
        // invoke regular function using local name
        var result = addfunc(3, 6)
        print("The sum of two numbers is: $result")
    }

    fun main(args: Array<String>) {
        // invoke higher-order function
        higherfunc(::add)
    }
}

//Kotlin program of a function returning another function-
fun programReturningAnotherFunction() {
    // function declaration
    fun mul(a: Int, b: Int): Int{
        return a*b
    }
    //higher-order function declaration
    fun higherfunc() : ((Int,Int)-> Int){
        return ::mul
    }
    fun main(args: Array<String>) {
        // invoke function and store the returned function into a variable
        val multiply = higherfunc()
        // invokes the mul() function by passing arguments
        val result = multiply(2,4)
        println("The multiplication of two numbers is: $result")
    }

}


/*
Extensions Functions

Kotlin gives the programmer the ability to add more functionality to the existing classes, without inheriting them
. This is achieved through a feature known as extensions. When a function is added to an existing class it is
 known as Extension Function. To add an extension function to a class, define a new function appended to the
 classname as shown in the following example:
*/


class extensionFunctions() {
    // A sample class to demonstrate extension functions
    class Circle (val radius: Double){
        // member
        // function of class
        fun area(): Double{
            return Math.PI * radius * radius;
        }
    }
    fun main(){
        // Extension function created for a class Circle
        fun Circle.perimeter(): Double{
            return 2*Math.PI*radius;
        }
        // create object for class Circle
        val newCircle = Circle(2.5);
        // invoke member function
        println("Area of the circle is ${newCircle.area()}")
        // invoke extension function
        println("Perimeter of the circle is ${newCircle.perimeter()}")
    }

}

/*
Derived class initialization order﻿

During the construction of a new instance of a derived class, the base class initialization is done as the first step
(preceded only by evaluation of the arguments for the base class constructor), which means that it happens before the
initialization logic of the derived class is run.

This means that when the base class constructor is executed, the properties declared or overridden in the derived
 class have not yet been initialized. Using any of those properties in the base class initialization logic (
 either directly or indirectly through another overridden open member implementation) may lead to incorrect behavior
  or a runtime failure. When designing a base class, you should therefore avoid using open members in the constructors,
    property initializers, or init blocks.
 */

/*
Interfaces

-cannot store state- unlike abstract classes
-Properties:
    -declared in an interface can either be abstract or provide implementations for accessors.
-Interfaces Inheritance﻿
An interface can derive from other interfaces, meaning it can both provide implementations for their members and declare
 new functions and properties. Quite naturally, classes implementing such an interface are only required to define
 the missing implementations:
 */


/*
SAM interfaces
    - functional interfaces using lambdas
 */
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

// Creating an instance using lambda
val isEven = IntPredicate { it % 2 == 0 }

//val isEven = object : IntPredicate {
//    override fun accept(i: Int): Boolean {
//        return i % 2 == 0
//    }
//}

//TAKING FUNCTIONS AS PARAMETERS
fun funWithParameters(): Unit {
    fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1 Declares a higher-order function. It takes two integer parameters, x and y. Additionally, it takes another function operation as a parameter. The operation parameters and return type are also defined in the declaration.
        return operation(x, y)                                          // 2 The higher order function returns the result of operation invocation with the supplied arguments.
    }
    fun sum(x: Int, y: Int) = x + y                                     // 3 Declares a function that matches the operationsignature.

    fun main() {
        val sumResult = calculate(4, 5, ::sum)                          // 4 Invokes the higher-order function passing in two integer values and the function argument ::sum. :: is the notation that references a function by name in Kotlin.
        val mulResult = calculate(4, 5) { a, b -> a * b }               // 5 Invokes the higher-order function passing in a lambda as a function argument. Looks clearer, doesn't it?

        println("sumResult $sumResult, mulResult $mulResult")
    }

}

//RETURNING FUNCTIONS
//fun returningFunctions() {
//    fun operation(): (Int) -> Int {                                     // 1 Declares a higher-order function that returns a function. (Int) -> Int represents the parameters and return type of the square function.
//        return ::square
//    }
//    fun square(x: Int) = x * x                                          // 2 Declares a function matching the signature.
//    fun main() {
//        val func = operation()                                          // 3 Invokes operation to get the result assigned to a variable. Here func becomes square which is returned by operation.
//        println(func(2))                                                // 4
//    }
//}

//LAMBDA FUNCTIONS
fun lambdaFuns() {
    // All examples create a function object that performs upper-casing.
// So it's a function from String to String
    val upperCase1: (String) -> String = { str: String -> str.uppercase() } // 1 A lambda in all its glory, with explicit types everywhere. The lambda is the part in curly braces, which is assigned to a variable of type (String) -> String (a function type).
    val upperCase2: (String) -> String = { str -> str.uppercase() }         // 2 Type inference inside lambda: the type of the lambda parameter is inferred from the type of the variable it's assigned to.
    val upperCase3 = { str: String -> str.uppercase() }                     // 3 Type inference outside lambda: the type of the variable is inferred from the type of the lambda parameter and return value.
    // val upperCase4 = { str -> str.uppercase() }                          // 4 You cannot do both together, the compiler has no chance to infer the type that way.
    val upperCase5: (String) -> String = { it.uppercase() }                 // 5 For lambdas with a single parameter, you don't have to explicitly name it. Instead, you can use the implicit it variable. This is especially useful when the type of it can be inferred (which is often the case).
    val upperCase6: (String) -> String = String::uppercase                  // 6 If your lambda consists of a single function call, you may use function pointers (::) .
}

//EXTENSION FUNCTIONS AND PROPERTIES
class extensionFunsProps  {
    data class Item(val name: String, val price: Float)                                         // 1

    data class Order(val items: Collection<Item>)

    fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F    // 2
    fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

    val Order.commaDelimitedItemNames: String                                                   // 3
        get() = items.map { it.name }.joinToString()

    fun main() {

        val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

        println("Max priced item name: ${order.maxPricedItemName()}")    //Max priced item name: Wine                       // 4
        println("Max priced item value: ${order.maxPricedItemValue()}")  //Max priced item value: 29.0
        println("Items: ${order.commaDelimitedItemNames}")               //Items: Bread, Wine, Water                       // 5

    }
}

/* PARTITION: collections
    The partition function splits the original collection into a pair of lists using a given predicate:
    Elements for which the predicate is true.
    Elements for which the predicate is false.
*/
class partition() {
    fun main() {
        val numbers = listOf(1, -2, 3, -4, 5, -6)                // 1

        val evenOdd = numbers.partition { it % 2 == 0 }           // 2
        val (positives, negatives) = numbers.partition { it > 0 } // 3

        println("Numbers: $numbers") //Numbers: [1, -2, 3, -4, 5, -6]
        println("Even numbers: ${evenOdd.first}") //Even numbers: [-2, -4, -6]
        println("Odd numbers: ${evenOdd.second}") //Odd numbers: [1, 3, 5]
        println("Positive numbers: $positives") //Positive numbers: [1, 3, 5]
        println("Negative numbers: $negatives") //Negative numbers: [-2, -4, -6]
    }
}

//COMPOSABLE FUNCTIONS
fun composableFunctions() {
    val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // 1

    fun addIssue(uniqueDesc: String): Boolean {
        return openIssues.add(uniqueDesc)                                                             // 2
    }

    fun getStatusLog(isAdded: Boolean): String {
        return if (isAdded) "registered correctly." else "marked as duplicate and rejected."          // 3
    }

    fun main() {
        val aNewIssue: String = "uniqueDescr4"
        val anIssueAlreadyIn: String = "uniqueDescr2"

        println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")                              // 4
        println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")                // 5
    }
}

//GETORELSE: getOrElse
//getOrElse provides safe access to elements of a collection. It takes an index and a function
// that provides the default value in cases when the index is out of bound.
fun getOrElse() {
    val list = listOf(0, 10, 20)
    println(list.getOrElse(1) { 42 })    // 10
    println(list.getOrElse(10) { 42 })   // 42
}


//The DELEGATION PATTERN has proven to be a good alternative to implementation inheritance,


//BOUND REFERENCES
//fun References() {
//    class Outer {
//        inner class Inner
//    }
//
//    val o = Outer()
//    val boundInnerCtor = o::Inner
//
//    //HTML DSL
//    fun htmlDSL() {
//        fun main() {
//            document.body!!.append.div {
//                h1 {
//                    +"Welcome to Kotlin/JS!"
//                }
//                p {
//                    +"Fancy joining this year's "
//                    a("https://kotlinconf.com/") {
//                        +"KotlinConf"
//                    }
//                    +"?"
//                }
//            }
//        }
//    }
//}

//DESTRUCTURING DECLARATION
fun destructDeclarations() {
    data class Article(val title: String, val author: String, val words: Long, val published: Boolean)
    val anArticle = Article("Define multiple variables at once in Kotlin", "Kai", 4200L, false)
    val (title, _, _, publishedAlready) = anArticle
    //assertThat(title).isEqualTo(anArticle.title)
    //assertThat(publishedAlready).isFalse

    //assigning multiple values using an array or list
    val (aLong, aString, aList) = arrayOf(42L, "Kotlin is awesome!", listOf("I", "am", "a", "list", "."))

}

/*
Builder


 */


///** Function as a parameter **/
//fun functionAsParameter() {
//    val numbers = arrayOf(2, 3, 1, 7, 9)
//    val numbers1 = numbers.map { i -> i * 2 + 1 }//{5, 7, 3, 15, 19}
//    val numbers2 = numbers.filter { it % 3 == 0 } //{3, 9}
//
//    numbers1.forEach { print("${it} ") }
//    println()
//    numbers2.forEach { print("${it} ") }
//}
//
//fun modifyCapturedVariables() {
//    var x = 5
//    val addXtoY = { y: Int -> x += y }
//    addXtoY(4)
//    println(x)
//    Math.pow
//}
//
//fun lambdasWithMultipleOperators() {}
//
//
//.select('patient_id,
//element_at(
//    transform(
//        filter( 'summaries, _("valid_date_of_death_switch") === "V" ),
//                            _("date_of_death")
//               ), 1
//                ) as "date_of_death",
//            explode('outpatient_claims) as "outpatient_claims_exploded", )
