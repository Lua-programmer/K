package a11.iterators

class Animal(val name: String)

class Zoo(private val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {
    val zoo = Zoo(listOf(Animal("Zebra"), Animal("Cabral"), Animal("Leão")))

    for (animal in zoo) println("Watch out, ${animal.name}")
}