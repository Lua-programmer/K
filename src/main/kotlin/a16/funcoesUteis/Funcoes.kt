package a16.funcoesUteis

val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11)

val positives = numbers.filter { x -> x > 0 }

val negatives = numbers.filter { it < 0 }

val pairs = numbers.filter { x -> x % 2 == 0 }

//O map passa e altera a lista

val doubled = numbers.map { x -> x * 2 }

val tripled = numbers.map { it * 3 }


fun main() {
    println(positives)
    println(negatives)
    println(pairs)
    println(doubled)
    println(tripled)

}