//uma função de ordem superior é uma função que recebe outra função como parâmetro e/ou retorna uma função.
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1 função que recebe x e y do tipo inteiro,
   // e uma operation que recebe uma declaração de função
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun main() {
    val sumResult = calculate(4, 5, ::sum) //chamada direta da função definida no escopo
    val mulResult = calculate(4, 5) { a, b -> a * b }   //função declarativa
    println("sumResult $sumResult, mulResult $mulResult")
}