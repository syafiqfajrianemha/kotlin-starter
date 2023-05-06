package functionalprogramming

/*
1. run -> akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda.
        sangat berguna jika di dalam blok lambda terdapat inisialisasi objek dan perhitungan untuk nilai.
2. with -> fungsi with bukanlah sebuah extension melainkan hanyalah fungsi biasa.
        Konteks objeknya disematkan sebagai argumen dan dari blok lambda diakses sebagai receiver.
        Fungsi with sendiri disarankan untuk mengakses apa yang menjadi anggotanya tanpa harus menyediakan nilai kembalian.
3. apply -> nilai dari konteks objeknya dan objek konteksnya tersedia sebagai receiver (this).
        Baiknya fungsi apply dapat melakukan inisialisasi atau konfigurasi dari receiver-nya.
 */
fun main() {
    // run
    val text = "Hello"
    val resultRun = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text $from to $to"
    }
    println("result $resultRun")

    // with
    val message = "Hello Kotlin!"
    val resultWith = with(message) {
        // Nilai yang akan dikembalikan adalah berdasarkan expression yang berada di dalam blok lambda.
        "First character is ${this[0]} and length is ${this.length}"
    }
    println(resultWith)

    // apply
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")
    println(builder.toString())
    // Dengan fungsi apply kita bisa menuliskannya seperti di bawah ini:
    val messageApply = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }
    println(messageApply.toString())
}