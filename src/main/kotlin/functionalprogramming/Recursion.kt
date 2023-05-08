package functionalprogramming

/*
- Recursion merupakan sebuah teknik dasar dalam pemrograman yang bisa kita gunakan untuk
menyederhanakan pemecahan masalah yang umumnya diselesaikan dengan cara yang kompleks.
- Recursive function adalah sebuah mekanisme di mana sebuah fungsi digunakan dari dalam fungsi itu sendiri.
Ini memungkinkan sebuah fungsi dapat berjalan beberapa kali.

Tail Call Recursion -> sekumpulan urutan instruksi untuk menjalankan tugas tertentu (subroutine) yang dijalankan terakhir pada sebuah prosedur.
Dengannya, kita bisa meminimalisir penumpukan frame ketika kita menerapkan recursive.
Tail recursion akan memastikan proses sebelumnya telah selesai sebelum pemanggilan fungsi berikutnya dijalankan.
 */
tailrec fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        n
    } else {
        /*var result = 1
        for (i in 1..n) {
            result *= i
        }
        result*/
        // menggunkan resursive
        factorial(n - 1, newResult)
    }
}

fun main() {
    println("Factorial 99999 is: ${factorial(99999)}")
}