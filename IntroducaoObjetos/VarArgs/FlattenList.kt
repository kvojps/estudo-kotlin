package IntroducaoObjetos.VarArgs

fun flatten(listOfLists: List<List<String>>): List<String> {
    val result = mutableListOf<String>()
    for (list in listOfLists) {
        result.addAll(list)
    }
    return result
}

fun main() {
    val listOfLists = listOf(listOf("a", "b"), listOf("c", "d"))
    println(listOfLists)
}