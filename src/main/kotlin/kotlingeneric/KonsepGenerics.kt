package kotlingeneric

/*
- Secara umum generic merupakan konsep yang digunakan untuk menentukan tipe data yang akan kita gunakan.
- Pendeklarasiannya ditandai dengan tipe parameter.
- Kita juga bisa mengganti tipe parameter menjadi tipe yang lebih spesifik dengan menentukan instance dari tipe tersebut.
 */
fun main() {
    // contoh bagaimana generic bekerja pada variabel dengan tipe List
    val contributor = listOf<String>("Syafiq", "Fajrian", "Emha")

    // kita juga bisa mendeklarasikan lebih dari satu tipe parameter
    val points = mapOf<String, Int>("Syafiq" to 10, "Emha" to 20)
}