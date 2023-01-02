package a13.igualdade

/***
 * == verifica se são iguais em estrutura, === verifica se tem o mesmo local de memória
 ***/

fun main() {
    val authors = setOf("Shekespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shekespeare", "Hemingway")
    val numbers = setOf(1,2,3)
    val names = setOf("Luna", "Zoe", "David")

    println(authors == writers) //true pois tem os mesmos valores dentro da lista
    println(authors === writers) //false apesar de ter os mesmos valores não possuem o mesmo local de memória
    println(authors == numbers)  //false
    println(authors == names) //false

}