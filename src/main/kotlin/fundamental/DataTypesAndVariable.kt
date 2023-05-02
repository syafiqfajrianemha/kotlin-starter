package fundamental

fun main() {
    val name = "Syafiq"

    print("Hello my name is ")
    println(name)
    print(if(true) "Always true" else "Always false")

    /*
    Sebuah variabel akan membutuhkan kata kunci:
    var atau val, indentifier, type, initialization
    */
    var company: String = "Dicoding" // kita diperbolehkan untuk tidak menulis tipe deta secara eksplisit
    company = "Dicoding Academy" // jika kita ubah ke val makan akan error: Val cannot be reassigned

    /*
    Ketika kita menggunakan operator + terhadap dua variabel
    Maka kedua nilai dari variabel firstWord dan lastWord akan digabungkan menjadi satu nilai
    */
    val fisrtWord = "Dicoding"
    val lastWord = "Academy"
    println(fisrtWord + lastWord)

    /*
    Berbeda ketika kita menggunakan operator + pada variabel yang bertipe Int
    Kompiler akan menjalankan operasi aritmatika
    */
    val valueA: Int = 10
    val valueB = 20
    println(valueA + valueB)
}