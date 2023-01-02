package a7.classesGenericas

import java.util.*

class MutableStack<E>(vararg items: E){  //Define uma classe genérica onde o E é um tipo genérico
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack = ${elements.joinToString()}"
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    val stack3 = mutableStackOf("Luana ", "Ana", "David", "Zoe")
    println(stack3)

    val stack2 = mutableStackOf(1,3,5,7,9)
    println(stack2)

    val stack = MutableStack(2,6,8,7,4)

    stack.push(9)
    println(stack)

    println("peek(): ${stack.peek()}")
    println(stack)

    println("pop(): ${stack.pop()}")
    println(stack)

    for (i in 1..stack.size()){
        println("pop(): ${stack.pop()}")
        println(stack)
    }

    println(stack.isEmpty())
}