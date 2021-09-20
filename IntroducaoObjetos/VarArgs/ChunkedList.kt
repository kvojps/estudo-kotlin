package IntroducaoObjetos.VarArgs

fun listOfChunks(size: Int, vararg elements: String): List<List<String>> {
    return elements.toList().chunked(size)
}

fun main() {
    val chunks = listOfChunks(3, "a", "b", "c", "d", "e", "f", "g")
    println(chunks)
}