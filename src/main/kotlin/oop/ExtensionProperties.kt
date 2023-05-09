package oop

/*
- Kita dapat menambahkan sebuah properti tanpa harus membuat sebuah kelas yang mewarisi kelas tersebut.
- Extension properties dilakukan di luar kelas.
- Extension properties hanya bisa didefinisikan dengan cara menyediakan getter dan/atau setter secara eksplisit.
 */
class Hewan(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

// membuat Extension Properties
val Hewan.getInfoHewan: String
    get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"

fun main() {
    val eshanCat = Hewan("Eshan Miaw", 5.0, 2, true)
    println(eshanCat.getInfoHewan)
}