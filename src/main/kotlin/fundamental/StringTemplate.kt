package fundamental

fun main() {
    /*
    Sebuah fitur yang memungkinkan kita untuk menyisipkan sebuah variabel,
    ke dalam sebuah String tanpa concatenation (penggabungan objek String menggunakan +)
     */
    val name = "Kotlin"
    println("My name is " + name)

    // menggunakan string template
    println("My name is $name")

    /*
    Kita juga bisa menyisipkan sebuah expression ke dalam sebuah string template
     */
    val hour = 9
    println("Office ${if (hour > 7) "already close" else "is open"}")
}