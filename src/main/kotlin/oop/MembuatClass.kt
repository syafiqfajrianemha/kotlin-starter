package oop

class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean) {
    fun eat() {
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

fun main() {
    val eshanCat = Animal("Eshan Miaw", 4.2, 2, true)
    println("Nama: ${eshanCat.name}, Berat: ${eshanCat.weight}, Umur: ${eshanCat.age}, Mammalia: ${eshanCat.isMammal}")
    eshanCat.eat()
    eshanCat.sleep()
}