package a10.loops

fun main() {

    val cakes = listOf("carrot", "cheese", "chocolate")
    for (c in cakes) println("Yummy, it's a $c cake!")

    for (i in 1..60) if (i % 2 == 0) println(i)

}