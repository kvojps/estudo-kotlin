package IntroducaoObjetos.Listas


fun findMax(list: List<Int>): Int {
    var num = 0
    for (x in list) {
        if (x > num)
            num = x
    }
    return num
}

fun main() {
    val list = listOf(1, 2, 3, 2)
    println(findMax(list))
}