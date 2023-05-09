package oop

import kotlin.reflect.KProperty

/*
- Sebuah kelas yang memang bertugas untuk mengatur atau mengelola fungsi getter dan setter untuk sebuah properti kelas.
-  Dengan ini kita dapat meminimalisir boilerplate dalam penulisan,
getter dan setter (jika properties menggunakan var) pada setiap kelas yang kita buat.
 */
class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

// kita juga dapat membuat sebuah delegasi kelas umum yang dapat digunakan oleh seluruh tipe data dengan memanfaatkan tipe data Any.
class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

// mendelegasikan banyak properti yang terdapat pada banyak kelas
class Dog {
    // untuk mendelegasikan sebuah properti kelas, kita gunakan keyword by
    // var name: String by DelegateName()

    // delegate dengan tipe data yang berbeda
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

fun main() {
    /*val dog = Dog()
    dog.name = "Heli"
    println("Nama Hewan: ${dog.name}")

    val person = Person()
    person.name = "SYafiq"
    println("Nama Orang: ${person.name}")

    val hero = Hero()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")*/

    // memberikan nilai pada setiap properti dengan tipe data yang berbeda.
    val animal = Dog()
    animal.name = "Heli"
    animal.weight = 6.2
    animal.age = 2

    println("Nama: ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur: ${animal.age} Tahun")
}