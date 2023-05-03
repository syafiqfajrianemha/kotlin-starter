package dataclassesandcollections

fun main() {
    /*
    Data class adalah sebuah kelas yang tidak memiliki logika apapun dan juga tidak memiliki fungsionalitas lain selain menangani data.
    Hanya dengan satu baris kode di atas, kompiler akan secara otomatis menghasilkan constructor,
    toString(), equals(), hashCode(), copy() dan juga fungsi componentN().
     */
    data class User(val name : String, val age : Int)
    
    /*
    Beberapa hal yang perlu diperhatikan dalam membuat sebuah data class adalah:
    - Konstruktor utama pada kelas tersebut harus memiliki setidaknya satu parameter;
    - Semua konstruktor utama perlu dideklarasikan sebagai val atau var;
    - Modifier dari sebuah data class tidak bisa abstract, open, sealed, atau inner.
     */
}