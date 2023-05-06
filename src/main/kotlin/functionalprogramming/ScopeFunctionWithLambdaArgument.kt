package functionalprogramming

/*
1. let -> Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek.
        Penggunaan fungsi let akan banyak kita temukan pada objek yang bertipe non-null.
2. also -> nilai yang dikembalikan adalah nilai dari konteks objek.
        Fungsi also baiknya digunakan ketika kita ingin menggunakan konteks dari objek sebagai argumen tanpa harus mengubah nilainya.
 */
fun main() {
    // let
    val messageLet: String? = "emha"
    messageLet?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    // menjalankan logika kode lain jika objeknya bernilai null
    } ?: run {
        val text = "message is null"
        println(text)
    }
    // Dengan menggunakan fungsi let seperti pada kode di atas, kita bisa mengurangi penggunaan operator safe call
    val length = messageLet?.length ?: 0
    val textLet = "text length $length"
    println(textLet)


    // also
    val textAlso = "Hello Kotlin!"
    val result = textAlso.also {
        println("value length -> ${it.length}")
    }
    println("textAlso -> $result")
}