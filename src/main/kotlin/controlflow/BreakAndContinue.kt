package controlflow

fun main() {
    /*
    Continue digunakan untuk melewatkan proses iterasi dan lanjut dengan proses iterasi berikutnya.
    Sementara itu, Break digunakan untuk menghentikan proses iterasi.
     */
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) continue // coba ubah menjadi break
        println(i)
    }

    /*
    ebuah expression dapat ditandai dengan sebuah label. Label pada Kotlin memiliki sebuah identifier yang diikuti dengan tanda @
     */
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
    /*
    Pada kode diatas, break yang sudah ditandai dengan label akan dilompati ke titik awal proses
    perulangan yang sudah ditandai dengan label. break akan menghentikan proses perulangan terluar
    dari dalam proses perulangan, di mana break tersebut dipanggil.
     */
}