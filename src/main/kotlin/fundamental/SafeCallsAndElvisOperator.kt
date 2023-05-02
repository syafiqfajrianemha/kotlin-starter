package fundamental

fun main() {
    /*
    Safe calls operator (?.) -> safe call akan menjamin kode yang kita tulis aman dari NullPointerException
     */
    var text: String? = null
    text?.length

    /*
    Elvis Operator (?:) -> memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null
    Elvis akan mengembalikan nilai text.length jika text tidak bernilai null. Sebaliknya, jika text bernilai null maka default value yang akan dikembalikan.
     */
    var text2: String? = null
    text2 = "emha"
    val textLength = text2?.length ?: 7
    println(textLength)

    /*
    operator non-null assertion (!!) -> tersebut sangat tidak disarankan karena akan memaksa sebuah objek menjadi non-null
     */
    // text = "syafiq"
    val panjangText = text!!.length // ready to go ???
    println(panjangText)
}