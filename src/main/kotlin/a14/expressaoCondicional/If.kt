package a14.expressaoCondicional

//No kotlin não temos o if ternário por isso utilizamos o if linear

fun main() {
//    fun max(a: Int, b: Int): Int {
//        if (a > b) {
//            return a
//        } else {
//            return b
//        }
//    }

    fun max(a: Int, b: Int) = if (a > b) a else b

    println(max(99, -42))
}