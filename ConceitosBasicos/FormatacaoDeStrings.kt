package ConceitosBasicos

fun main() {
    val resposta = 42
    println("Encontrado: $resposta!")

    val condicao = true
    println(
        "${if (condicao) 'a' else 'b'}"
    )
    val x = 11
    println("$x + 4 = ${x + 4}")
}
