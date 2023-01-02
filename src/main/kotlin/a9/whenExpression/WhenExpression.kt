package a9.whenExpression

fun main() {
    println(whenAssign(1))
    println(whenAssign(6.4))
    println(whenAssign("hello"))
    println(whenAssign(MyClass()))

}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }

    return result
}

class MyClass()