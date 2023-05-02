package fundamental

fun main() {
    /*
    Array yang memiliki fungsi get dan set serta properti size
    Untuk membuat sebuah Array kita bisa memanfaatkan sebuah library function arrayOf()
     */
    val array = arrayOf(1, 3, 5, 7)

    /*
    Kita juga dapat memasukkan nilai dengan berbagai jenis tipe data
     */
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)

    /*
    Kotlin juga memungkinkan kita untuk membuat Array dengan tipe data primitif dengan memanfaatkan beberapa fungsi spesifik
    - intArrayOf() : IntArray
    - booleanArrayOf() : BooleanArray
    - charArrayOf() : CharArray
    - longArrayOf() : LongArray
    - shortArrayOf() : ShortArray
    - byteArrayOf() : ByteArray
     */
    val intArray = intArrayOf(1, 3, 5, 7)
    println(intArray[2])

    /*
    Dengan indexing kita juga bisa mengubah nilai
     */
    intArray[2] = 11
    println(intArray[2])
}