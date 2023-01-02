package a12.ranges

fun main() {
    for (i in 0..3) println(i) //vá de zero até 3, inclusive o 3

    println("---------")

    for (i in 0 until 3) println(i) //vá de zero até 3 exclusive o 3

    println("-------")

    for (i in 2..8 step 2) println(i) //vai de 2 a 8 de 2 em 2

    println("-------")

    for (i in 3 downTo 0) println(i) //começa em 3 e decresce

}