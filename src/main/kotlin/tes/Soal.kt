package tes

data class DataUser(val name : String, val address : String)

fun main() {
    for (i in 1..3) {
        for (j in 1..i) {
            println(j)
        }
    }

    for (i in 10 until 13) {
        println("$i ")
    }

    val dicoding = DataUser("Dicoding Indonesia", "Bandung")
    println(dicoding)
}