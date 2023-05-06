package functionalprogramming

/*
- Standard function library, yaitu sebuah extension functions dari sebuah objek yang
menggunakan lambda sebagai argumen atau yang disebut sebagai higher-order function.

Scope Function
- Mengeksekusi blok kode dari dalam sebuah objek.
- Beberapa fungsi yang berada di dalamnya antara lain let, run, with, apply, dan also.

Context Object
- Diakses sebagai lambda receiver (this) dan lambda argumen (it).
- Keduanya memiliki kapabilitas yang sama dan tentunya digunakan untuk kasus yang berbeda.

1. Lambda receiver (this)
- Beberapa fungsi yang menggunakan lambda receiver adalah run, with, dan apply.
- Ketika ingin mengakses konteks dari sebuah objek, kita bisa saja tidak menuliskan atau menghilangkan kata kunci this.

2. Lambda argument (it)
- Fungsi yang menggunakan lambda argument untuk mengakses konteks dari sebuah objek adalah fungsi let dan also.
- Berbeda dengan lambda receiver, nilai dari argumen tersebut dapat kita gunakan untuk diproduksi atau di inisialisasikan untuk variabel lain.
 */
fun main() {
    println("Hello Kotlin Standard Library")

    val name = "Hallo"
    name.let {
        val message = "$it Kotlin"
        println(message)
    }
    // Secara default, nama dari argumen tersebut adalah it, namun kita dapat mengubahnya
    name.let { value ->
        val message = "$value Emha"
        println(message)
    }
}