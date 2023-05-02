package controlflow

fun main() {
    val color: Color = Color.RED
    println(color.printValue())

    /*
    Setiap enum class memiliki sebuah synthetic method yang memungkinkan kita,
    mendapatkan daftar objek Enum dan nama dari tiap Enum itu sendiri.
     */
    val colors = Color.values()
    colors.forEach {
        color -> println(color)
    }

    /*
    Untuk mendapatkan nama dari objek Enum kita bisa menggunakan fungsi valueOf()
     */
    val warna = Color.valueOf("RED")
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}") // toString(16) untuk menampilkan angka yang berupa HexaDesimal

    /*
    Selain menggunakan fungsi values() dan fungsi valueOf(),
    kita bisa mendapatkan daftar objek Enum dan nama dari objek Enum dengan cara yang lebih umum.
    Caranya, gunakan fungsi enumValues() dan fungsi enumValueOf()
     */
    /*val colors: Array<Color> = enumValues()
    colors.forEach {color ->
        println(color)
    }*/
    /*val color: Color = enumValueOf("RED")
    println("Color is $color")*/

    /*
    kita juga bisa mendapatkan posisi tiap objek menggunakan properti ordinal
     */
    val colorGreen = Color.GREEN
    println("Position GREEN is ${colorGreen.ordinal}")

    /*
    setiap objek merupakan instance dari enum class yang kita definisikan.
    Lantas bagaimana cara kita mengecek instance dari Enum itu sendiri?
    Nah, untuk mengeceknya, gunakan When Expression
     */
    when(colorGreen) {
        Color.RED -> println("Color is Red")
        Color.BLUE -> println("Color is Blue")
        Color.GREEN -> println("Color is Green")
    }
}

/*
Enumeration merupakan salah satu fitur yang bisa kita gunakan untuk menyimpan kumpulan objek yang telah didefinisikan menjadi tipe data konstanta
 */
enum class Color(val value: Int) {
    /*
    Selain itu, kita juga dapat menambahkan perintah yang lebih spesifik dengan menambahkan,
    abstract function dan mendeklarasikan anonymous class untuk setiap objek Enum
     */
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}