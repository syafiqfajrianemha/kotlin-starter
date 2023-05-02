package fundamental

fun main() {
    /*
    Characters direpresentasikan menggunakan tipe Char
    Char menggunakan tanda kutip tunggal (' ')
    Tipe data Char hanya dapat kita gunakan untuk menyimpan karakter tunggal
    */
    val character: Char = 'A' // jika kita mencoba memasukkan lebih dari satu karakter maka akan error: Too many characters in a character literal
    println(character)

    /*
    Yang menarik, kita bisa melakukan operasi:
    increment (++) dan decrement (--) pada sebuah variabel dengan tipe data Char
    Characters merupakan representasi dari Unicode
    - Unicode A adalah 0041
    - Unicode B adalah 0042
    */
    var vocal = 'A'
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
}