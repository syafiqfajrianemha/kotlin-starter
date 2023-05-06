package functionalprogramming

/*
sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter, menjadikan tipe kembalian, ataupun keduanya
 */
var jumlah: (Int) -> Int = {value -> value + value}

inline fun printResult(value: Int, jumlah: (Int) -> Int) {
    val result = jumlah(value)
    println(result)
}

fun main() {
    printResult(10, jumlah)
    printResult(20){ value ->
        value + value
    }
    printResult(30){ value ->
        value + value
    }
}