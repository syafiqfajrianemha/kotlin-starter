package controlflow

fun main() {
    /*
    Range direpresentasikan dengan operator .. atau dengan fungsi rangeTo() dan downTo().
    Jarak antara dua nilai yang dicakup, ditentukan oleh step. Secara default, step bernilai 1
     */
    val rangeInt = 1..10
    println("Range default: ${rangeInt.step}")

    /*
    mengubah nilai dari step bisa dilakukan ketika kita menginisialisasi nilai yang dicakup Range
     */
    val rangeInt2 = 1..10 step 2
    rangeInt2.forEach {
        println(it)
    }
    println("Range: ${rangeInt2.step}")

    // fungsi rangeTo()
    val rangeInt3 = 1.rangeTo(10)

    // menentukan nilai yang dicakup pada Range dengan urutan terbalik
    val downInt = 10.downTo(1) // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

    // memeriksa apakah suatu nilai ada pada cakupan nilai Range
    // bisa menggunakan in atau !in
    val tenToOne = 10.downTo(1)
    if(7 in tenToOne) {
        println("Value 7 available")
    }

    // Expression yang dievaluasi pada if di atas sama seperti ketika menggunakan expression
    if (1 <= 7 && 7 <= 10){
        println("Value 7 available")
    }

    /*
    Kotlin mendukung beberapa tipe integral seperti IntRange, LongRange dan CharRange.
    Sehingga selain nilai numerik, kita juga bisa menentukan tipe Character sebagai nilai yang dicakup oleh Range
     */
    val rangeChar = 'A'.rangeTo('F')
    rangeChar.forEach {
        print("$it ")
    }
}