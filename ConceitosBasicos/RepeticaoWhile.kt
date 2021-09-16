package ConceitosBasicos

fun condicao(i: Int) = i < 100

fun main() {
    var i = 0
    while (condicao(i)) {
        print(".")
        i += 10
    }
}