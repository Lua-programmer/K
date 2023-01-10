data class Person(var name: String, var age: Int, var about: String) {
    constructor(): this("", 0, "") //sorecarga de construtor

    override fun toString(): String {
        return "Nome: $name, idade: $age, sobre: $about"
    }
}

fun main() {
    val jake = Person()
    println(jake.toString())

    val stringDescription = jake.apply { //o apply passa modificando cada atributo
        name = "Jake"
        age = 22
        about = "Android Development"
    }.toString()

    println(stringDescription)
}