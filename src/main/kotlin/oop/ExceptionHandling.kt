package oop

/*
- Exception handling dapat diterapkan dengan cara menggunakan try-catch, try-catch-finally, dan multiple catch.
 */
fun main() {
    /*
    1. try-catch
    - Kode yang dapat membangkitkan suatu exception disimpan dalam blok try,
    dan jika exception tersebut terjadi, maka blok catch akan terpanggil.

    try {
        // Block try, menyimpan kode yang membangkitkan exception
    } catch (e: SomeException) {
        // Block catch akan terpanggil ketika exception bangkit.
    }
     */
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }


    /*
    2. try-catch-finally : Selain terdapat blok try dan catch, ada juga blok finally. Hanya saja blok ini bersifat opsional.
    - finally akan dieksekusi setelah program keluar dari blok try ataupun catch.
    - Bahkan finally juga tereksekusi ketika terjadi exception yang tidak terduga.
     */
    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
    } finally {
        println(someMustNotNullValue)
    }
    // Dengan menerapkan finally, fungsi println() cukup dituliskan pada blok finally.


    /*
    3. Multiple Catch
    - Memungkinkan untuk penanganan exception dapat ditangani lebih dari satu tipe exception.
    - Hal ini sangat berguna ketika kita ingin menangani setiap tipe exception dengan perlakuan yang berbeda.

    try{
        // Block try, menyimpan kode yang membangkitkan exception
    } catch (e: NullPointerException) {
        // Block catch akan terpanggil ketika terjadi NullPointerException.
    } catch (e: NumberFormatException) {
        // Block catch akan terpanggil ketika terjadi NumberFormatException.
    } catch (e: Exception) {
        // Block catch akan terpanggil ketika terjadi Exception selain keduanya.
    }
    finally {
        // Block finally akan terpanggil setelah keluar dari block try atau catch
    }
     */
    val someStringValue: String? = null
    var someIntValue: Int = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}