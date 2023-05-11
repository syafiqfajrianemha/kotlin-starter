package oop

/*
Overloading -> menggunakan dua atau lebih fungsi dengan nama yang sama disebut dengan overloading.
Overloading dapat dilakukan selama fungsi itu memiliki parameter yang berbeda.
 */
class Animal4(private var name: String) {
    fun eat() {
        println("$name makan!")
    }

    fun eat(typeFood: String) {
        println("$name memakan $typeFood!")
    }

    fun eat(typeFood: String, quantity: Double) {
        println("$name memakan $typeFood sebanyak $quantity grams!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

fun main() {
    val cat = Animal4("Eshan Miaww")

    cat.eat()
    cat.eat("Ikan Tuna")
    cat.eat("Ikan Tuna", 450.0)
}