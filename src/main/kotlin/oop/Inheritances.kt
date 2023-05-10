package oop

/*
Inheritance atau pewarisan dapat mencegah kita melakukan perulangan kode.
Dalam Kotlin untuk melakukan extends pada sebuah kelas dapat dilakukan dengan tanda : (titik dua)
 */

// Kelas pada Kotlin secara default bersifat final,
// oleh karena itu kita harus mengubahnya menjadi open class sebelum melakukan extends kelas tersebut.
open class Animal3(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){
    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}

// kelas Cat dengan melakukan extends pada kelas Animal
// kelas Cat juga dapat mengakses seluruh fungsi dan properti yang terdapat kelas Animal
class Cat1(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Animal3(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat(){
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }
}

fun main() {
    val dicodingCat = Cat1("Dicoding Miaw", 3.2, 2, true, "Brown", 4)

    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()
}