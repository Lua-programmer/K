//Certas funções podem ser "atualizadas" para operadores, permitindo suas chamadas com o símbolo da operadora correspondente.

fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..27])
}