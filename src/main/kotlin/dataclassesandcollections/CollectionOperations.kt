package dataclassesandcollections

fun main() {
    /*
    Collection juga mempunyai beberapa fungsi operasi yang bisa kita gunakan untuk mengakses data di dalamnya.
     */

    // filter() dan filterNot()
    /*
    Kedua fungsi tersebut akan menghasilkan list baru dari seleksi berdasarkan kondisi yang kita berikan.
    Sesuai dengan namanya, untuk mem-filter atau menyaring suatu data dalam sebuah collection.
     */
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    // Selain itu kita juga dapat mem-filter list berdasarkan hasil yang tak sesuai dengan kondisi yang diberikan.
    val notEvenList = numberList.filterNot { it % 2 == 0 }
    println(notEvenList)


    // map()
    /*
    Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya.
     */
    val multipliedBy5 = numberList.map { it * 5 } // it merepresentasikan masing masing item
    println(multipliedBy5)


    // count()
    /*
    Fungsi count() dapat kita gunakan untuk menghitung jumlah item yang ada di dalam collection.
     */
    println(numberList.count())
    // Di dalam fungsi count() kita juga bisa menambahkan sebuah parameter berupa lambda yang berisi sebuah kondisi.
    println(numberList.count {it % 3 == 0}) // menghitung ada berapa item yang merupakan kelipatan 3: 3, 6, dan 9.


    // find(), firstOrNull(), & lastOrNull() -> fungsi yang digunakan untuk mencari item pada sebuah collection
    // jika di dalam collection tidak ditemukan data yang sesuai, maka fungsi akan mengembalikan nilai null.
    val firstOddNumber = numberList.find { it % 2 == 1 } // mencari angka ganjil pertama
    val firstOrNullNumber = numberList.firstOrNull {it % 2 == 3}
    val lastOrNullNumber = numberList.lastOrNull()
    println(firstOddNumber)
    println(firstOrNullNumber)
    println(lastOrNullNumber)


    // first() & last() -> digunakan untuk menyaring item pertama atau terakhir dari sebuah collection.
    /*
    Kita juga bisa menambahkan sebuah kondisi dengan parameter lambda.
    Namun perlu diperhatikan jika kita menambahkan kondisi padahal kondisi tersebut tidak terpenuhi, akan Exception!
     */
    val firstNumber = numberList.first()
    // val moreThan10 = numberList.first { it > 10 } // 1 > 10: tidak terpenuhi, maka akan ERROR
    println(firstNumber)


    // sum() -> Fungsi ini akan menjumlahkan setiap data yang ada pada collection.
    val total = numberList.sum()
    for(i in numberList) {
        print("$i+")
    }
    println(" = $total")


    // sorted() -> digunakan untuk mengurutkan item yang ada di dalam collection.
    // secara default fungsi sorted() ini akan mengurutkan data secara ascending.
    val descandingSort = numberList.sortedDescending()
    println(descandingSort)

    val randomNumber = listOf(5, 3, 8, 10, 20, 16, 13, 7)
    val ascendingSort = randomNumber.sorted() // default ascending atau dari kecil ke besar
    println(ascendingSort)
}