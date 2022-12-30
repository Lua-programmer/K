package a3.funcoesVararg

fun main() {
    printAll("Hello", "Salut", "Hi", "Olá")
    printAllWithPrefix("Luana", "David", "Zoe", prefix = "Olá")
    log("Hello-log", "Salut-log", "Hi-log", "Olá-log")
}

fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println("$prefix $m")
}

fun log(vararg entries: String) {
    printAll(*entries)
}