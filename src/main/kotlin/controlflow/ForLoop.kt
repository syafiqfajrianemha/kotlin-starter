package controlflow

fun main() {
    /*
    For dapat digunakan pada Ranges, Collections, Arrays dan apapun yang menyediakan iterator
     */
    val ranges = 1..10 step 3
    for (i in ranges){
        println("value is $i!")
    }

    /*
    mengakses indeks untuk setiap elemen yang ada pada Ranges dengan memanfaatkan fungsi withIndex()
     */
    val ranges2 = 1.rangeTo(10) step 3
    for((index, value) in ranges2.withIndex()) {
        println("value $value with index $index")
    }

    // memanfaatkan salah satu ekstensi pada Kotlin yaitu forEach
    ranges2.forEach() { value ->
        println("value is $value!")
    }
    ranges2.forEachIndexed { index, value ->
        println("value $value with index $index")
    }

    /*
    Jika kita hanya ingin menggunakan argumen index, maka kita bisa mengubah argumen value menjadi _ (underscore).
    Sebenarnya ini merupakan sebuah aturan di mana ketika argumen dari sebuah lambda expression tidak,
    digunakan, kita disarankan agar mengubahnya menjadi _ untuk menggantikan nama dari argumen tersebut
     */
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}