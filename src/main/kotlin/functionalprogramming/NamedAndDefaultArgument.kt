package functionalprogramming

fun getFullName(firstName: String, middleName: String = "", lastName: String): String {
    return "$firstName $middleName $lastName"
}

fun main() {
    val fullName = getFullName("Syafiq", "Fajrian", "Emha")
    println(fullName)

    // mengubah posisi argument
    val awesome = getFullName(middleName = "is", firstName = "Kotlin", lastName = "Awesome")
    println(awesome)

    // default value
    val ana = getFullName(firstName = "Erdiana", lastName = "Marlentina")
    println(ana)
}