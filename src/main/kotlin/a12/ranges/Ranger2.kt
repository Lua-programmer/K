package a12.ranges

fun main() {
    for (c in 'a'..'z') print("$c - ")

    println()
    println()

    for (c in 'z' downTo 's' step 2) print("$c - ")

    println()
    println()

    for (c in "Luana") print("$c - ")

    println()
    println()

    //também é possível fazer estruturas condicionais com os ranges
    val x = 6
    if (x in 2..5) println("yes")
    if (x !in 2..5) println("no")
}