package IntroducaoObjetos.Propriedades

class X {
    val a = 3
    val b = 42
    var c = 0

    fun add(): Int {
        c = a + b
        return c
    }
}

fun main() {
    val x = X()
    x.add()
}