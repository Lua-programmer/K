package a16.funcoesUteis

val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11)

val positives = numbers.filter { x -> x > 0 }

val negatives = numbers.filter { it < 0 }

val pairs = numbers.filter { x -> x % 2 == 0 }

//O map passa e altera a lista

val doubled = numbers.map { x -> x * 2 }

val tripled = numbers.map { it * 3 }

//any -> A função any retorna truese a coleção contiver pelo menos um elemento que corresponda ao predicado fornecido.

val anyNegative = numbers.any { it < 0 }

val anyGT6 = numbers.any { it > 22 }

//all -> A função all retorna true se todos os elementos na coleção corresponderem ao predicado fornecido.

val positivesAll = numbers.all { it > 0}

//none -> A função none retorna true se não houver elementos que correspondam ao predicado fornecido na coleção.

val maior70 = numbers.none{it > 70}

fun main() {
    println(positives)
    println(negatives)
    println(pairs)
    println(doubled)
    println(tripled)
    println(anyNegative)
    println(anyGT6)
    println(positivesAll)
    println(maior70)
}