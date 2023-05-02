package fundamental

fun main() {
    /*
    If expression direpresentasikan dengan kata kunci if
    Else akan dijalankan jika hasil evaluasi pada expression yang diberikan menghasilkan nilai false
    Blok else if akan dijalankan jika hasil evaluasi pada branch sebelumnya bernilai false

    Kotlin tidak mendukung ternary operator (condition ? then : else)
     */
    val openHours = 7
    val now = 7
    val office: String

    /*
    If merupakan sebuah expressions yang dapat mengembalikan nilai, sehingga kita dapat menyimpan hasilnya ke dalam sebuah variabel.
     */
    office = if (now > openHours){
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)
}