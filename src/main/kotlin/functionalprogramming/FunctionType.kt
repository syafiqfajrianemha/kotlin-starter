package functionalprogramming

/*
Kita dapat membuat sebuah fungsi menjadi tipe data. (Int, Int) -> String dua paramter Int dan tipe kembalian strinng
Manfaatkan kata kunci typealias untuk memberikan nama alternatif dari sebuah function type
 */
typealias Arithmetic = (Int, Int) -> Int

val sum : Arithmetic = {valueA, valueB -> valueA + valueB}

val multiply : Arithmetic = {valueA, valueB -> valueA * valueB}

fun main() {
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply(20, 20)

    println(sumResult)
    println(multiplyResult)
}