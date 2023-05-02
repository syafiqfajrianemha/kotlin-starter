package fundamental

fun main() {
    /*
    Integer (bilangan bulat): Byte, Short, Int, dan Long
    Floating Point (bilangan pecahan): Float dan Double
    Untuk mengetahui nilai minimal dan maksimal yang dapat disimpan oleh suatu tipe Number
    MIN_VALUE dab MAX_VALUE
     */
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    /*
    Jika kita memasukan nilai melebihi nilai maksimal yang dapat disimpan, maka akan terjadi overflow.
    Nilai yang akan dikembalikan adalah nilai minimal yang dapat disimpan
     */
    val overRangeInt = maxInt + 1 // This operation has led to an overflow
    println("Over range Int: $overRangeInt")

    /*
    Konversi
    - toByte(): Byte
    - toShort(): Short
    - toInt(): Int
    - toLong(): Long
    - toFloat(): Float
    - toDouble(): Double
    - toChar(): Char
     */
    val stringNumber = "23"
    val intNumber = 3

    println(intNumber + stringNumber.toInt())

    /*
    Dengan Kotlin kita juga bisa menuliskan nilai numerik yang “readable”
    dengan menggunakan tanda underscores
     */
    val readableNumber = 100_000_000
    println(readableNumber)
}