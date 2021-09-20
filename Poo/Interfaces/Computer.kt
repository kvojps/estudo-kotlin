package Poo.Interfaces

interface Computer {
    fun prompt(): String
    fun calculateAnswer(): Int
}

class Desktop : Computer {
    override fun prompt() = "Hello!"

    override fun calculateAnswer() = 0
}

class DeepThought : Computer {
    override fun prompt() = "Thinking..."

    override fun calculateAnswer() = 2
}

fun main() {
    val computers = listOf(
        Desktop(), DeepThought()
    )
    computers.map { println(it.calculateAnswer()) }
    computers.map { println(it.prompt()) }
}