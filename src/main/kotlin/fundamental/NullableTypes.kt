package fundamental

fun main() {
    /*
    NullPointerException (NPE), sebuah kesalahan yang terjadi saat ingin mengakses atau mengelola nilai dari,
    sebuah variabel yang belum diinisialisasi atau variabel yang bernilai null
    Kita harus berhati-hati karena NPE menyebabkan aplikasi yang kita kembangkan, rusak saat dijalankan.
     */
    // val text: String = null // compile time error

    /*
    Jika  ingin sebuah objek bisa bernilai null,
    kita bisa menambahkan tanda ? setelah menentukan tipe dari objek
    Namun kita tidak bisa langsung mengakses atau mengelola nilai dari objek yang sudah kita tandai sebagai nullable
     */
    val text: String? = null
    // val textLength = text.length // // compile time error

    /*
    Cara mudahnya, periksa objek tersebut apakah bernilai null atau tidak
     */
    if(text != null) {
        val textLength = text.length // ready to go
    }
}