package IntroducaoObjetos.Sets

val carnes = setOf("beef", "chicken")
val frutas = setOf("apple", "orange", "banana", "kiwi")
val vegetais = setOf("beans", "peas", "carrots", "sweet potatoes", "asparagus", "spinach")

private fun contarPorcentagem(produtos: Set<String>, carrinhoCompras: Set<String>) =
    100.0 * (produtos intersect carrinhoCompras).size / carrinhoCompras.size

fun porcentagemCarne(carrinhoCompras: Set<String>): Double =
    contarPorcentagem(carnes, carrinhoCompras)

fun porcentagemFruta(carrinhoCompras: Set<String>): Double =
    contarPorcentagem(frutas, carrinhoCompras)

fun porcentagemVegetais(carrinhoCompras: Set<String>): Double =
    contarPorcentagem(vegetais, carrinhoCompras)

fun porcentagemOutros(carrinhoCompras: Set<String>): Double =
    100.0 * (carrinhoCompras - carnes - frutas - vegetais).size / carrinhoCompras.size

fun main() {
    val carrinhoCompras = setOf(
        "apple", "pretzels", "bread", "orange", "beef",
        "beans", "asparagus", "sweet potatoes", "spinach", "carrots"
    )

    println(porcentagemCarne(carrinhoCompras))
    println(porcentagemFruta(carrinhoCompras))
    println(porcentagemVegetais(carrinhoCompras))
    println(porcentagemOutros(carrinhoCompras))
}