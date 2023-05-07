package functionalprogramming

/*
Pada suatu kondisi, terkadang kita butuh mereferensikan sebuah fungsi.
 */
fun isEvenNumber(number: Int) = number % 2 ==0

var pesan = "Kotlin"

fun main() {
    // function references
    val numbers = 1..10
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)

    // property references -> kita bisa mengakses apa yang menjadi bagian dari properti tersebut seperti nama, fungsi setter getter, dll.
    println(::pesan.name)
    println(::pesan.get())

    ::pesan.set("Kotlin Academy")

    println(::pesan.get())
}