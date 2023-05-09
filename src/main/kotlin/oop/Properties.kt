package oop

/*
ketika properti pada kelas dibuat mutable, maka Kotlin akan menghasilkan fungsi getter dan setter pada properti tersebut.
Jika properti pada sebuah kelas dibuat read-only, Kotlin hanya akan menghasilkan fungsi getter pada properti tersebut.
 */
class Cat {
    var name: String = "Eshan Miaw"

    // melakukan override pada fungsi getter dan juga setter
    // kita dapat mendefinisikan fungsi get() tanpa mendefinisikan fungsi set() dan juga sebaliknya.
    get() {
        println("Fungsi Getter terpenggil")
        return field
    }
    set(value) {
        println("Fungsi Setter terpanggil")
        field = value
    }
}

fun main() {
    val eshanCat = Cat()
    println("Nama: ${eshanCat.name}")
    eshanCat.name = "Goose"
    println("Nama: ${eshanCat.name}")
}