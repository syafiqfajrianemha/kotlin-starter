package fundamental

fun main() {
    /*
    String direpresentasikan menggunakan tipe String.
    String merupakan kumpulan dari beberapa karakter
    Kita bisa mendefinisikannya dengan tanda petik ganda (" ")
    */
    val textString: String = "Kotlin"

    /*
    Pada dasarnya sekumpulan karakter dalam String tersebut berbentuk Array,
    sehingga kita bisa mendapatkan karakter tunggal dengan mudah
    */
    val firstChar = textString[0]
    println("First character of $textString is $firstChar")

    /*
    Melakukan iterasi terhadap objek String dengan menggunakan for-loop
    */
    for(char in textString) {
        println(char)
    }

    /*
    Escaped String yang memungkinkan kita untuk mengurangi ambiguitas nilai yang berada di dalam sebuah String
    - \t: menambah tab ke dalam teks.
    - \n: membuat baris baru di dalam teks.
    - \’: menambah karakter single quote kedalam teks.
    - \”: menambah karakter double quote kedalam teks.
    - \\: menambah karakter backslash kedalam teks.
    Kita juga bisa menambahkan sebuah Unicode ke dalam sebuah String
    */
    val statement = "Kotlin is \"Awesome\". \u00A9"
    println(statement)

    /*
    Raw String yang memungkinkan kita menuliskan multiline dan arbitrary text
    Kita mendefinisikan sebuah Raw String menggunakan triple quote (""" """).
    memungkinkan kita untuk membuat beberapa baris String tanpa,
    penggabungan (concatenation) dan penggunaan karakter escaped
    */
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()
    print(line)
}