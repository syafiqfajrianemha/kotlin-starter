package oop

/*
- Objek merupakan hasil realisasi dari sebuah blueprint atau
class yang tentunya memiliki fungsi dan juga properti sama seperti blueprint-nya.
- Artinya, dengan membuat objek kita dapat mengakses fungsi dan properti yang terdapat pada kelas tersebut.
- Pada Kotlin, nilai primitif seperti String, Integer, Char, Boolean merupakan sebuah Object.
 */
fun main() {
    val name = "Syafiq"
    println(name.reversed())
    println(name.toUpperCase())
    println(name.toLowerCase())

    val someString = "123"
    val someInt = someString.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()
    println(someInt is Int)
    println(someDouble is Double)
}