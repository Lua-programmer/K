package a18.funcoesEscopo

//with é uma função sem extensão que pode acessar membros de seu argumento de forma concisa:
// você pode omitir o nome da instância ao se referir a seus membros.

class Configuration(val host: String, val port: Int)

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    with(configuration) {
        println("$host:$port")
    }

    //other alternative
    configuration.run { println("$host:$port") }

    // instead of:
    println("${configuration.host}:${configuration.port}")
}