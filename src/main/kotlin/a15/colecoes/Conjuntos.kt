package a15.colecoes

val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")
//variavel imutavel recebendo uma instancia de um set mutavel


fun addIssue(uniqueDescr: String): Boolean {
    return openIssues.add(uniqueDescr)
}

fun getStatus(isAdded: Boolean): String {
    return if (isAdded) "registered correctly" else "marked as duplicate and rejected"
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatus(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatus(addIssue(anIssueAlreadyIn))}")
}