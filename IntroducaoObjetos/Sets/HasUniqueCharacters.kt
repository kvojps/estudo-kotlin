package IntroducaoObjetos.Sets

fun hasUniqueCharacters(s: String): Boolean {
    var s2 = ""
    for (x in s) {
        if (x !in s2)
            s2 += x
    }
    return s == s2
}

//fun hasUniqueCharacters(s: String): Boolean {
//  return s.toSet().size == s.length
//}

fun main() {
    println(hasUniqueCharacters("abcd"))
    println(hasUniqueCharacters("abcb"))
}