package a18.funcoesEscopo

fun main() {
    fun getNullableLength(ns: String?): Int {
        println("for '$ns' :") //Vai imprimir qualquer coisa independente de nulo ou não
        return ns?.run {
            println("is empty? " + isEmpty())
            println("length = $length")
            length
        } ?: 0
    }

    println(getNullableLength(null))
    println(getNullableLength(""))
    println(getNullableLength("some string with Kotlin"))
}
