package controlflow

fun main() {
    /*
    expression adalah statement yang dapat mengembalikan nilai dan bisa kita simpan ke dalam sebuah variabel.
     */
    val openOffice = 7
    val now = 8
    val office = if (now > openOffice) "Office already open" else "Office close"
    println(office)

    // statement
    val value1 = 10
    val value2 = 10

    // expression -> setiap fungsi selalu mengembalikan nilai
    // Alhasil, pemanggilan sebuah fungsi merupakan sebuah expression.
    sum(value1, value2)
}

fun sum(value1: Int, value2: Int) = value1 + value2