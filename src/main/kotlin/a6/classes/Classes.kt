package a6.classes

/***A declaração de classe consiste no nome da classe, no cabeçalho da classe (especificando seus parâmetros de tipo,
 * o construtor primário, etc.) e no corpo da classe, entre chaves. Tanto o cabeçalho quanto o corpo são opcionais; se
 * a classe não tiver corpo, as chaves podem ser omitidas.***/

class Client //Declara uma classe nomeada Client sem nenhuma propriedade ou construtor definido pelo usuário.
// Um construtor padrão não parametrizado é criado pelo Kotlin automaticamente.

class Contact(
    val id: Int,
    var email: String
)    // Declara uma classe com duas propriedades:
// immutable ide mutable emaile um construtor com
// dois parâmetros ide email.

fun main() {
    val client = Client() //Cria uma instância da classe Customerpor meio do construtor padrão. Observe que não há newpalavra-chave em Kotlin.

    val contact = Contact(1, "luanamelissa@gmail.com") //Cria uma instância da classe Customerpor meio do
    // construtor padrão. Observe que não há newpalavra-chave em Kotlin.

    println(contact.id ) //Acessa a propriedade id
    println(contact.email)
    contact.email = "luanamelissa@outlook.com"//Atualiza o valor da propriedade email.
    println(contact.email)
}