package IntroducaoObjetos.VarArgs

fun printArgs(string: String, vararg number: Int) {
    var listaNumeros = listOf<Int>()
    for (x in number) {
        listaNumeros += x
    }
    println(string + listaNumeros)
}

fun main() {
    printArgs("Numbers: ", 1, 2, 3)
}