package functionalprogramming

/*
vararg (variable argument)
Dengan menggunakan kata kunci vararg kita juga bisa menyederhanakan beberapa parameter yang memiliki tipe data yang sama menjadi parameter tunggal.
- Lalu kapan kita membutuhkan vararg?  Ketika sebuah fungsi yang menggunakannya tidak,
- mengetahui jumlah argumen yang akan disematkan ketika fungsi tersebut dipanggil.

- Hanya boleh terdapat 1 paramter vararg di dalam sebuah fungsi
- Paramter vararg sebaiknya berada pada posisi terakhir
 */
fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun getNumberSize(vararg number: Int): Int {
    return number.size
}

// menerapkan Generic untuk tipe parameter ketika parameter tersebut ditentukan dengan vararg
fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for(item in input) {
        result.add(item)
    }
    return result
}

fun main() {
    // melampirkan beberapa argument
    val hitung = sumNumbers(10, 20, 30, 40)
    println(hitung)

    val number = getNumberSize(10, 20, 30, 40, 50)
    println(number)

    // memasukkan nilai yang sudah berbentuk Array
    val arrayInt = intArrayOf(50, 50)
    println(sumNumbers(10, 10, *arrayInt, 10))
}