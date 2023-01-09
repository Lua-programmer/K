package a17.poo

//Herança passando argumentos do construtor para a super classe
open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

//Não tem var ou val pois vai propagar da super classe
class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    val lion : Lion = Asiatic("Rufo")
    lion.sayHello()
}