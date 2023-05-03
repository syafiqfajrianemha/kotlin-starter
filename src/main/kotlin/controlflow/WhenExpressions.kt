package controlflow

import kotlin.random.Random

fun main() {
    /*
     When Expression,  yakni mekanisme yang memungkinkan nilai dari sebuah variabel/expression, mampu mengubah alur program.
     */
    val value = 6

    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("Value cannot be reached")
    }

    /*
    when expression dapat mengembalikan nilai dan dapat disimpan di dalam sebuah variabel
     */
    val stringOfValue = when(value) {
        /*
        Jika kita memiliki dua atau lebih baris kode yang akan kita jalankan di setiap branch,
        kita bisa memindahkannya ke dalam curly braces
         */
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }
    println(stringOfValue)

    /*
    memeriksa instance dengan tipe tertentu dari sebuah objek menggunakan is atau !is.
     */
    val anyType: Any = 100L
    when(anyType) {
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    /*
    memeriksa nilai yang terdapat pada sebuah Range atau Collection
     */
    val number = 27
    val ranges = 10..50
    when(number) {
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }

    // kita dapat menangkap subjek dari when expression di dalam sebuah variabel.
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
    println(registerNumber)

    /*
    Jika kita melihat penjelasan dan contoh penggunaan dari when expression di atas, ia memiliki
    kesamaan dengan if expression. Lantas disituasi seperti apa kita menggunakannya? if expression
    sebaiknya digunakan ketika kondisi yang diberikan tidak lebih dari 2 (dua) dan kondisi yang diberikan
    tidak terlalu rumit.
     */
    if (anyType is Long){
        println("the value has a Long type")
    } else {
        println("the value is not Long type")
    }

    // Berbeda dengan when expression, ia bisa digunakan ketika kondisi yang diberikan lebih dari 2 (dua).
    when (anyType) {
        is Long -> println("the value has a Long type")
        is Int -> println("the value has a Int type")
        is Double -> println("the value has a Double type")
        else -> println("undefined")
    }
}

fun getRegisterNumber() = Random.nextInt(100)