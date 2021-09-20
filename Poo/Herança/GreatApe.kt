package Poo.Herança

open class GreatApe {
    protected var energy = 0
    open fun call() = "Hoo!"
    open fun eat() {
        energy += 10
    }

    fun climb(x: Int) {
        energy -= x
    }

    fun energyLevel() = "Energy: $energy"
}

class Bonobo: GreatApe() {
    override fun call() = "Bazinga!"

    override fun eat() {
        energy += 10
        super.eat()
    }

    fun run() = "Bonobo run"
}

class Chimpanzee: GreatApe() {
    val additionalEnergy = 20
    override fun call() = "Que viva muito e prospere!"
    override fun eat() {
        energy += additionalEnergy
        super.eat()
    }
    fun jump() = "Chimp jump"
}

fun talk(ape: GreatApe): String {
    ape.eat()
    ape.climb(10)
    return "${ape.call()} ${ape.energyLevel()}"
}

fun main() {
    println(talk(GreatApe()))
    println(talk(Bonobo()))
    println(talk(Chimpanzee()))
}

