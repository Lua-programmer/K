package a15.colecoes

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3) //criando uma variável imutável que recebe uma lista mutável
val sudoers: List<Int> = systemUsers //copia de leitura da lista anterior

fun addSystemUser(newUser: Int) { //função que adiciona um novo usuário
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSystemUser(4)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
        i -> println("Some useful info on user $i")
    }
}