package IntroducaoObjetos.Listas

fun countOccurrences(list: List<Int>, number: Int): Int {
    var contador = 0
    for (x in list) {
        if (x == number)
            contador ++
    }
    return contador
}

fun main() {
    val list = listOf(1, 2, 3, 2)
    println(countOccurrences(list, 2))
}