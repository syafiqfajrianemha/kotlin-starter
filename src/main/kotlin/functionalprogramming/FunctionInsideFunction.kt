package functionalprogramming

import java.lang.IllegalArgumentException

fun setWord(message: String) {
    // Kita bisa mengakses apa yang menjadi bagian fungsi terluarnya
    fun printMessage() {
        println(message)
    }

    // inner function hanya bisa diakses setelah fungsi tersebut didefinisikan.
    printMessage()
}

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    /*if (valueA == 0) {
        throw IllegalArgumentException("valueA must be better than 0")
    }
    if (valueB == 0) {
        throw IllegalArgumentException("valueB must be better than 0")
    }
    if (valueC == 0) {
        throw IllegalArgumentException("valueC must be better than 0")
    }
    return valueA + valueB + valueC*/

    // menggunakan inner function
    /*fun validateNumber(value: Int) {
        if(value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }
    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)*/

    // inner funtion sebagai extensions function
    fun Int.validateNumber() {
        if(this == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }
    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB + valueC
}

fun main() {
    setWord("Hello World")
    println(sum(10, 10, 10))
}