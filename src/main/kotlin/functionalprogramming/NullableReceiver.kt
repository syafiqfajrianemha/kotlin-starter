package functionalprogramming

/*
kita bisa juga mendeklarasikan sebuah extension dengan nullable receiver type.
Alhasil, extension tersebut bisa dipanggil pada objek yang bahkan nilainya null.
 */
val Int?.slice: Int
    // get() = if(this == null) 0 else this.div(2)
    get() = this?.div(2) ?: 0 // elvis operator

fun main() {
    val value: Int? = null
    val value1: Int? = null

    /*
    Lalu kapan kita membutuhkannya? Tentunya jika kita mempunyai sebuah objek yang bernilai null.
    Saat kita tidak menetapkannya dengan nullable receiver type, maka kita perlu memeriksa apakah
    objek tersebut bernilai null atau tidak? Bisa juga dengan menggunakan operator safe call setiap
    kali extension tersebut dipanggil.
     */
    println(value.slice)
    println(value1.slice)
}