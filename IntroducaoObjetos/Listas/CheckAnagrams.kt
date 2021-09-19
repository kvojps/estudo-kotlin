package IntroducaoObjetos.Listas

fun checkAnagrams(s1: String, s2: String): Boolean {
    return s1.toList().sorted() == s2.toList().sorted()
}

fun main() {
    println(checkAnagrams("thing", "night"))
    println(checkAnagrams("leader", "dealer"))
    println(checkAnagrams("sector", "escort"))
    println(checkAnagrams("tablet", "battle"))
    println(checkAnagrams("sections", "notices"))
}