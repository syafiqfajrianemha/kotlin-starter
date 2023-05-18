package main.kotlin.kotlingeneric

/*
- Variance adalah konsep yang menggambarkan bagaimana sebuah tipe yang
memiliki subtipe yang sama dan tipe argumen yang berbeda saling berkaitan satu sama lain.
- Variance dibutuhkan ketika kita ingin membuat kelas atau fungsi generic
dengan batasan yang tidak akan mengganggu dalam penggunaannya.
 */
abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)

// Covariant
interface List2<out E> : Collection<E> {
    operator fun get(index: Int): E
}

// Contravariant
interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}

fun main() {
    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var vehicle: Vehicle = car
    vehicle = motorCycle
    // variabel car dan motorcycle merupakan subtipe dari Vehicle
    // sehingga kita bisa melakukan assignment antar dua variabel tersebut.

    val carList = listOf(Car(100), Car(120))
    val vehicleList = carList
}