package functionalprogramming

fun main() {
    /*
    1. Fold -> kita bisa dengan mudah melakukan perhitungan setiap nilai yang berada di dalam sebuah collection,
    tanpa harus melakukan iterasi item tersebut satu-persatu
     */
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    // foldRight() -> melakukan proses iterasi dari indeks terakhir
    val foldRight = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println("Fold result: $foldRight")

    /*
    2. Drop -> memangkas item yang berada di dalam sebuah objek collection berdasarkan jumlah yang kita tentukan
     */
    val number = listOf(1, 2, 3, 4, 5, 6)
    // val drop = number.drop(3)
    val dropLast = number.dropLast(3) // memangkas nilai dari indeks terakhir
    println(dropLast)

    /*
    3. Take -> menyaring item yang berada di dalam sebuah objek collection
     */
    val total = listOf(1, 2, 3, 4, 5, 6)
    // val take = total.take(5)
    val takeLast = total.takeLast(5)
    println(takeLast)
}