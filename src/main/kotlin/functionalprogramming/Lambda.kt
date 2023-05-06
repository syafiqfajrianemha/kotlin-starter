package functionalprogramming

/*
lambda sangat berguna karena dapat membuat penulisan kode menjadi lebih mudah dan sederhana.
 */

// contoh deklarasi dari lambda
// ditandai dengan sepasang kurung kurawal
val message = {println("Hello From Lambda")}

// mendeklarasi lambda agar dapat mengembalikan nilai
val nameLength = {name: String -> name.length}

// menambahkan sebuah parameter pada fungsi lambda
val sayHello = {name: String -> println("Hello $name")}

fun main() {
    message()

    val nameLength = nameLength("emha")
    println(nameLength)

    sayHello("Syafiq")
}