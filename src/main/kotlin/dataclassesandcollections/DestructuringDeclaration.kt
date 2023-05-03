package dataclassesandcollections

import app.DataUser

fun main() {
    /*
    Destructuring Declaration adalah proses memetakan objek menjadi sebuah variabel.
    Dengan fungsi componentN() yang ada pada data class, kita bisa menguraikan sebuah objek menjadi beberapa properti yang dimilikinya.
     */
    val dataUser = DataUser("Syafiq", 19)

    val name = dataUser.component1()
    val age = dataUser.component2()
    println("My name is $name, I'm $age years old")

    // membuat beberapa variabel dari objek secara langsung
    val (nama, umur) = dataUser
    println("Nama saya $nama, umur saya $umur tahun")

    dataUser.intro()
}