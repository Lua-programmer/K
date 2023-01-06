package a17.poo

//open class é uma classe base, que pode ser alvo de herança. Ela pode ser mãe de uma outra classe.
open class Dog {
    open fun sayHello() { //Essa função pode ser sobreescrita
        println("wow wow!")
    }
}


class Yorkshire : Dog() {
    override fun sayHello() { //sobreescrevendo a função aberta, se não fosse open fun isso não seria possível.
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}

