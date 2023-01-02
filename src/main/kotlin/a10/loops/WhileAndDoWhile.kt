package a10.loops

fun main() {

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}

fun eatACake() = println("Eat a cake!")
fun bakeACake() = println("Bake a cake!")

