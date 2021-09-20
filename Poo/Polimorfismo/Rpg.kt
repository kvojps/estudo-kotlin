package Poo.Polimorfismo

abstract class Character(val name: String) {
    abstract fun play(): String
}

interface Fighter {
    fun fight() = "Fight!"
}

interface Magician {
    fun doMagic() = "Magic!"
}

class Warrior :
    Character("Warrior"), Fighter {
    override fun play() = fight()
}

open class Elf(name: String = "Elf") :
    Character(name), Magician {
    override fun play() = doMagic()
}

class FightingElf :
    Elf("FightingElf"), Fighter {
    override fun play() =
        super.play() + fight()
}

fun Character.playTurn() =
    println(name + ": " + play())

fun main() {
    val characters: List<Character> = listOf(
        Warrior(), Elf(), FightingElf()
    )
    characters.forEach { it.playTurn() }
}