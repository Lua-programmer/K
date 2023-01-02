package a8.whenStatement

/***
 * A declaração when é parecido com o switch case, só que um estrutura mais flexível
 ***/

fun main() {
    cases("Hello")
    cases(1)
    cases(67L)
    cases(67)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

class MyClass()