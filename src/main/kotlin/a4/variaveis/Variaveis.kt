package a4.variaveis

fun main() {
    var a: String = "Hello"  //Declara uma variável mutável e a inicializa
    println(a)

    val b: Int = 3 //Declara uma variável imutável e a inicializa
    println(b)

    val c = 3 //Declara uma variável imutável e a inicializa sem especificar o tipo. O compilador infere o tipo int
    println(c)

//    val d: Int
//    println(d) -> Dá erro pois não foi inicializada
// Você é livre para escolher quando inicializar uma variável, no entanto, ela deve ser inicializada antes da primeira leitura.

    var gender: Char
    val valid = true
    if (valid) gender = 'F' else gender = 'M'
    println(gender)
}