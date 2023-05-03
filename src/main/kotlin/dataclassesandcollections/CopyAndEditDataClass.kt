package dataclassesandcollections

data class DataUser2(val name: String, val age: Int)

fun main() {
    /*
    Data class juga memungkinkan kita untuk menyalin sebuah objek dengan sangat mudah hanya dengan
    memanfaatkan fungsi copy() di dalamnya.
     */
    val dataUser = DataUser("Syafiq", 19)
    val dataUser2 = DataUser("Syafiq", 19)
    val dataUser3 = DataUser("Joko", 24)
    val dataUser4 = dataUser.copy();
    println(dataUser4)

    //  dengan fungsi copy() kita juga bisa memodifikasi objek tersebut dengan nilai yang baru.
    val dataUser5 = dataUser.copy(age = 30)
    println(dataUser5)
}