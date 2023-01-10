//funções lambda("lambdas") são uma maneira simples de criar funções ad-hoc. Lambdas pode ser denotado de
// forma muito concisa em muitos casos, graças à inferência de tipo e à it variável implícita

fun main() {
    val upperCase1: (String) -> String = { str: String -> str.uppercase() } // 1 -  especificando o tipo internamente e externamente

    val upperCase2: (String) -> String = { str -> str.uppercase() }         // 2  - especificando o tipo extenamente

    val upperCase3 = { str: String -> str.uppercase() }   // 3  - especificando o tipo internamente

// val upperCase4 = { str -> str.uppercase() }      // 4 - Não funciona pois não especifica de nenhum lado o tipo da função

    val upperCase5: (String) -> String = { it.uppercase() }    // 5

    val upperCase6: (String) -> String = String::uppercase   // 6

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
}