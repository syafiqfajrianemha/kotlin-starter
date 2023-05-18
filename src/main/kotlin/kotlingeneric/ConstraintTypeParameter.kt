package main.kotlin.kotlingeneric

/*
kita bisa membatasi tipe apa saja yang dapat digunakan sebagai parameter.
Untuk menentukkan batasan tersebut, bisa dengan menambahkan tanda titik dua (:)
setelah tipe parameter yang kemudian diikuti oleh tipe yang akan dijadikan batasan.
class ListNumber<T : Number> : List<T>{
    override fun get(index: Int): T {
        /* .. */
    }
}
 */
interface List<T> {
    operator fun get(index: Int): T
}

class ListNumber<T : Number> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}

fun main() {
    val numbers1 = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
    // val numbers3 = ListNumber<String>() // error : Type argument is not within its bounds


    val numbers = listOf(1, 2, 3, 4, 5)
    //numbers.sumNumber()
    val names = listOf("dicoding", "academy")
    //names.sumNumber() // error : inferred type String is not a subtype of Number
}

// Contoh lain dari constraint type parameter
fun <T : Number> List<T>.sumNumber() : T {
    return this[0]
}