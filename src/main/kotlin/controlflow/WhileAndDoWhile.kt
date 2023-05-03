package controlflow

fun main() {
    /*
    While bersifat Entry Controlled Loop. Artinya, kondisi yang diberikan akan dievaluasi terlebih dahulu.
    Jika kondisi tersebut terpenuhi maka proses perulangan akan dijalankan.
    Jika kondisi yang diberikan tidak terpenuhi sejak awal maka proses perulangan tidak akan dijalankan.
     */
    var counter = 1
    while (counter <= 7){
        println("While: Hello, World!")
        counter++
    }

    /*
    Do While bersifat Exit Controlled Loop di mana proses perulangan akan
    langsung dijalankan di awal. Jika telah selesai, barulah kondisi yang diberikan akan dievaluasi.
     */
    var counter2 = 1
    do {
        println("Do While: Hello, World!")
        counter2++
    } while (counter2 <= 7)

    /*
    perhatikan infinite loop, yaitu kondisi di mana proses perulangan berlangsung terus menerus sampai aplikasi menjadi crash
    Infinite loop terjadi jika kondisi yang diberikan selamanya terpenuhi atau bernilai true.
     */

    // While dan Do While sendiri tidak dapat digunakan untuk melakukan perulangan pada rentan angka.
}