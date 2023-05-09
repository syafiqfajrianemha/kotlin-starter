package oop

/*
- Jika kelas tersebut memiliki primary constructor di dalamnya, maka kita diharuskan mengirim nilai sesuai properti yang dibutuhkan.
- Penulisan primary constructor mirip seperti parameter pada fungsi.
- Properti cukup dituliskan pada header class diawali dengan var atau val.
 */
class Animal1(val name: String, val weight: Double, val age: Int = 0, val isMammal: Boolean = true)

/*
Init block
- untuk membantu dalam memvalidasi sebuah nilai properti sebelum diinisialisasi
 */
class AnimalInit(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0 else age
        this.name = name
        this.isMammal = isMammal
    }
}

fun main() {
    val dicodingCat = Animal1("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")

    // menggunakan default value
    val eshanCat = Animal1("Eshan", 5.2, isMammal = false)
    println("Nama: ${eshanCat.name}, Berat: ${eshanCat.weight}, Umur: ${eshanCat.age}, mamalia: ${eshanCat.isMammal}" )

    // dengan validasi init block
    val cat = AnimalInit("Dicoding Miaw", 4.2, -1, true)
    println("Nama: ${cat.name}, Berat: ${cat.weight}, Umur: ${cat.age}, mamalia: ${cat.isMammal}")
}