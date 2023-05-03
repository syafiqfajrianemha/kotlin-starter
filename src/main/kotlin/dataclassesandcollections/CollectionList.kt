package dataclassesandcollections

import app.DataUser

fun main() {
    /*
    Collections merupakan sebuah objek yang bisa menyimpan kumpulan objek lain termasuk data class.
    Mampu menambahkan, menghapus, mencari, bahkan mengurutkan sebuah data.
    Bisa menyimpan banyak data sekaligus
    Terdapat objek turunan collection:
    - List
    - Set
    - Map
     */

    /*
    Dengan List kita dapat menyimpan banyak data menjadi satu objek.
    Kita bisa membuat sebuah List yang berisi sekumpulan data angka, karakter atau yang lainnya.
     */
    val numberList: List<Int> = listOf(1, 2, 3, 4, 5)
    val charlist: List<Char> = listOf('A', 'B', 'C')

    val anyList = listOf('A', "Kotlin", 3, true, DataUser("Syafiq", 19))
    println(anyList[3])

    /*
    List secara default tersebut bersifat immutable alias tidak bisa diubah.
    Tetapi jika kita ingin menambah, menghapus, atau mengganti nilai yang sudah ada,
    kita bisa menggunakan fungsi mutableListOf()
     */
    val data = mutableListOf('a', "Kotlin", 3, true)

    data.add('d') // menambah item di akhir list
    data.add(1, "love") // menambah item pada indeks ke-1
    data[3] = false // mengubah nilai item pada indeks ke-3
    data.removeAt(0) // menghapus item pada indeks ke-0
}