package IntroducaoObjetos.Mapas

class Hamster(val name: String) {
    override fun toString(): String {
        return "Hamster('$name')"
    }
}

class Cage(private val maxCapacity: Int) {
    private val hamsters: MutableMap<String, Hamster> =
        mutableMapOf()

    fun put(hamster: Hamster): Boolean =
        if (hamsters.size == maxCapacity)
            false
        else {
            hamsters[hamster.name] = hamster
            true
        }

    fun get(name: String): Hamster =
        hamsters.getValue(name)
}

fun main() {
    val cage = Cage(2)
    cage.put(Hamster("Alice"))
    println(cage.get("Alice"))
}