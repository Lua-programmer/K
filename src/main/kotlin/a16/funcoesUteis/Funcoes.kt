package a16.funcoesUteis

val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)

val positives = numbers.filter { x -> x > 0 }

val negatives = numbers.filter { it < 0 }

val pairs = numbers.filter { x -> x % 2 == 0 }

fun main() {
    print(positives)
    print(negatives)
    print(pairs)

}