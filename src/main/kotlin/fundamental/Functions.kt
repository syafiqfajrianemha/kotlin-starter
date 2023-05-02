package fundamental

fun main() {
    val user = setUser("Syafiq", 19)
    println(user)

    printUser("Syafiq")
}

/*
Function atau fungsi merupakan sebuah prosedur yang memiliki keterkaitan dengan pesan dan objek
Fungsi sendiri bisa diartikan sebagai cara sederhana untuk mengatur program buatan kita

fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
    return result
}
*/
fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}