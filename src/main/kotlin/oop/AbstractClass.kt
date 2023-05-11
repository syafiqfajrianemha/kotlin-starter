package oop

/*
Abstract class artinya, class tersebut tidak bisa dibuat sebagai object, hanya bisa diturunkan
 */
abstract class Animal5(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){
    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}

class Cat2(name: String, weight: Double, age: Int, isCarnivore: Boolean) : Animal5(name, weight, age, isCarnivore)

fun main() {
    // val animal = Animal5("dicoding animal", 2.6, 1, true) // error: Cannot create an instance of an abstract class

    val cat = Cat2("Eshan Miaw", 2.6, 1, true)
    cat.eat()
    cat.sleep()
}