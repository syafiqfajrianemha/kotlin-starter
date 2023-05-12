package oop

/*
- Exception adalah event (kejadian) yang dapat mengacaukan jalannya suatu program.
- Unchecked Exception yang sering mengganggu jalannya program -> ArithmeticException, NumberFormatException, NullPointerException
 */
fun main() {
    /*
    ArithmeticException merupakan exception yang terjadi karena kita membagi suatu bilangan dengan nilai nol.
     */
    val someValue = 6
    // println(someValue / 0) // ERROR

    /*
    NumberFormatException disebabkan karena terjadi kesalahan dalam format angka.
    Contoh: Kita akan mengubah sebuah nilai String menjadi Integer tetapi nilai String yang
    akan kita ubah tidak memiliki format angka yang benar
     */
    val someStringValue = "18.0"
    // println(someStringValue.toInt()) // ERROR

    /*
    NullPointerException atau NPE terjadi karena sebuah variabel atau objek memiliki nilai null,
    padahal seharusnya objek atau variabel tersebut tidak boleh null.
    Walaupun Kotlin memiliki operator Null Safety, NPE tetap bisa saja terjadi.
     */
    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue) // ERROR
}