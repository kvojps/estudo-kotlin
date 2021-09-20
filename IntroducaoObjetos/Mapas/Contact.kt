package IntroducaoObjetos.Mapas

class Contact(val name: String, val number: String) {
    override fun toString(): String {
        return "Contact('$name', '$number')"
    }
}

fun buildNumberToContactMap(contactList: List<Contact>): Map<String, Contact> {
    val map = mutableMapOf<String, Contact>()
    for (contact in contactList) {
        map[contact.name] = contact
    }
    return map
}

fun main() {
    val contactList = listOf(
        Contact("Miffy", "1-234-567890"),
        Contact("Cleo", "098-765-4321"),
    )
    val contactsByNumber = buildNumberToContactMap(contactList)
    println(contactsByNumber)
}