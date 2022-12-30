package a5.nullSafetyNulidade

/***
 *Em um esforço para livrar o mundo de NullPointerException, os tipos de variáveis ​​em Kotlin não permitem a
 * atribuição de null. Se você precisar de uma variável que possa ser nula, declare-a anulável adicionando ? no final
 * de seu tipo.
 * ***/

fun main() {
    val neverNull: String = "Aqui não pode ser nulo" //Declara uma variável não nula do tipo String
    // neverNull = null -> Ao tentar atribuir nulla uma variável não anulável, um erro de compilação é produzido.

    var anulavel: String? = "Aqui pode receber nulo" //Declara uma variável String anulável.
    anulavel = null

    var inferredNonNull = "Aqui não pode ser nulo" //Ao inferir um tipo o compilador assume que a variável não
    // pode receber um nulo.
    // inferredNonNull = null -> Ao tentar inserir um nulo um erro de compilação é inserido

    println(strLength(neverNull)) //Ao passar uma variável não nula dá certo
    // strLength(anulavel) //-> Ao tentar passar uma variável que pode ser nula, um erro de compilação é produzido

    println(describeString(neverNull))
    println(describeString(anulavel))

}

//Declara uma função com um parâmetro não-nulo do tipo string
fun strLength(notNull: String): Int {
    return notNull.length
}

/***
 * Às vezes, os programas Kotlin precisam trabalhar com valores nulos, como ao interagir com código Java externo ou
 * representar um estado realmente ausente. Kotlin fornece rastreamento nulo para lidar elegantemente com essas situações.
 ***/

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) return "$maybeString"
    else return "Variável nula"
}