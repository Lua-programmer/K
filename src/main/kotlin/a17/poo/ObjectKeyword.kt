//Object Expression -> Não precisar instanciar várias vezes a mesma classe para utilizar um método dela

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {

    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    print("Total price: $$total")

}

//Object Declaration -> Você pode acessar a classe diretamente
object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

//Companion Objects
class BigBen {
    companion object Bonger {  //cria como se fosse uma classe estatica, não precisa passar o nome Bonger, apenas a classe e o método
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                println("BONG ")
            }
        }
    }
}


fun main() {
    //rentPrice(10, 2, 1)
    //DoAuth.takeParams("foo", "qwerty")
    BigBen.getBongs(12)
}