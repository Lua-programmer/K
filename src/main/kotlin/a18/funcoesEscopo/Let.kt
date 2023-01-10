package a18.funcoesEscopo

//A função da biblioteca padrão Kotlin letpode ser usada para escopo e verificações nulas. Quando chamado em um objeto,
//letexecuta o bloco de código fornecido e retorna o resultado de sua última expressão. O objeto é acessível dentro do
//    bloco pela referência it(por padrão) ou um nome personalizado.


fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {
    val empty = "test".let {
        customPrint(it) //it representa a variável de escopo que chamou o let
        it.isEmpty()
    }
    println(" is empty: $empty")

    fun printNonNulll(str: String?) {
        println("Printing: $str")

        str?.let {
            print("\t")
            customPrint(it)
            println()
        }
    }

    printNonNulll(null)
    printNonNulll("My String")

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firstString ->
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    printIfBothNonNull("First","Second")
    printIfBothNonNull(null,"Second")
}