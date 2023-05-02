package fundamental

fun main() {
    /*
    Boolean adalah sebuah tipe data yang hanya memiliki dua nilai, yaitu true dan false
    Terdapat 3 (tiga) operator yang dapat digunakan pada Boolean:
    - Conjunction atau AND (&&) -> akan mengembalikan nilai true jika semua hasil evaluasi expression yang diberikan bernilai true
    - Disjunction atau OR (||) -> akan mengembalikan nilai true jika hasil evaluasi dari salah satu expressions yang diberikan bernilai true.
    - Negation atau NOT (!) -> digunakan untuk melakukan negasi pada hasil evaluasi expression yang diberikan.
     */
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        "Open"
    } else {
        "Closed"
    }

    // val isOpen = now >= officeOpen && now <= officeClosed

    print("Office is open : $isOpen")
}