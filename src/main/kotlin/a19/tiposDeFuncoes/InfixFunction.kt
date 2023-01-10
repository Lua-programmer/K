//Funções de membro e extensões com um único parâmetro podem ser transformadas emfunções infixas.

fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina" //o "to" vai criar um par de valores
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person3("Sofia")
    val claudia = Person3("Claudia")
    sophia likes claudia


}

class Person3(val name: String) {
    val likedPeople = mutableListOf<Person3>()
    infix fun likes(other: Person3) {
        likedPeople.add(other)
    }
}