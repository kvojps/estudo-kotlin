package Poo.Interfaces

interface Player {
    val symbol: Char
}

class Food : Player {
    override val symbol = '.'
}

class Robot : Player {
    override val symbol = 'J'
}

class Wall(override val symbol: Char) : Player

fun main() {
    listOf(Food(), Robot(), Wall('%')).map {
        println(it.symbol)
    }
}