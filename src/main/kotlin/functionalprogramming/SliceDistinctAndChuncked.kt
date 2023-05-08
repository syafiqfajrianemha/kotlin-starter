package functionalprogramming

fun main() {
    /*
    1. Slice -> menyaring item dari posisi tertentu
    fungsi slice() membutuhkan sebuah argumen berupa Range yang digunakan
    untuk menentukan posisi pertama dan terakhir yang akan disaring.
    *Kita harus berhati-hati dalam menentukan cakupan index untuk mendapatkan data. Karena dapat
    menyebabkan terjadinya ArrayIndexOutOfBoundsException jika posisi yang ditentukan tidak
    terdapat pada objek collection.
     */
    val index = listOf(2, 3, 5, 8)
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(5..8)
    // Karena menggunakan Range, kita juga bisa menggunakan operator step ketika argumennya disematkan
    val sliceStep = total.slice(7..9 step 2)
    // posisi yang lebih spesifik
    val spesifik = total.slice(index)
    println(spesifik)


    /*
    2. Distinct -> untuk menyaring item yang sama/duplikat
     */
    val totalDis = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = totalDis.distinct()
    println(distinct)

    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinctLength = text.distinctBy {
        it.length
    }
    println(distinctLength)


    /*
    3. Chunked -> untuk memecah nilai String menjadi beberapa bagian kecil dalam bentuk Array.
     */
    val word = "QWERTY"
    val chunked = word.chunked(1)
    println(chunked)

    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }
    println(chunkedTransform)
    // Argumen yang berada pada lambda expression di atas merepresentasikan setiap nilai yang sudah dipecah.
}