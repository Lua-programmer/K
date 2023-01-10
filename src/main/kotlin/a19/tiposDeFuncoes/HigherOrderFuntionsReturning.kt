fun operation(): (Int) -> Int {
    return ::square  //retorna outra função
    //:: aciona outra função pelo nome
}

fun square(x: Int) = x * x

fun main() {
    val func = operation()
    println(func(2))
}