package kotlingeneric

/*
- Generic pada sebuah fungsi dibutuhkan ketika kita membuat sebuah fungsi yang berhubungan dengan List.
Misalnya, list yang dapat digunakan untuk berbagai tipe dan tidak terpaku pada tipe tertentu.
- Fungsi generic memiliki tipe parameternya sendiri.
Tipe argumen dari parameternya ditentukan ketika fungsi tersebut dipanggil.

fun <T> run(): T {
    /*...*/
}

public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {
    /*...*/
}

 */


fun main() {
    val numbers = (1..100).toList()
    println(numbers.slice<Int>(1..10))

    val users = listOf<String>("Syafiq", "Fajrian", "Emha", "Budi", "Joko")
    println(users.slice(0..2))
}