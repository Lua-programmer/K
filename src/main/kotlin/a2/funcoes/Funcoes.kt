package a2.funcoes

fun main() {
    printMessage("My first function")
    printMessageWithPrefix("Baby", "Bye")
    printMessageWithPrefix("Baby", prefix = "Hello")
    printMessageWithPrefix(prefix = "Bye", message = "Love")
    println(sum(2, 3))
    println(multiply(2, 3))

}

fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Oi") {
    println("$prefix $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y
