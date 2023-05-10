package oop

/*
1. Public -> Jika tidak menyebutkan, maka secara otomatis visibility modifiers nya adalah public,
yang artinya bisa diakses dari manapun
 */
class SayHelloPublic(val firstName: String, val middleName: String, val lastName: String)

/*
2. Private -> Artinya hanya bisa diakses di tempat deklarasinya
Cara untuk mengakses properti private dari sebuah kelas adalah dengan menambahkan fungsi getter dan setter secara manual.
 */
class SayHelloPrivate(private var firstName: String, private val middleName: String, private val lastName: String) {
    fun getFirstName(): String {
        return firstName
    }

    fun setFirstName(newFirstName: String) {
        firstName = newFirstName
    }

    fun getMiddleName(): String {
        return middleName
    }

    fun getLastName(): String {
        return lastName
    }
}

/*
3. Protected -> Artinya hanya bisa diakses di tempat deklarasi, dan juga turunannya
 */
open class Binatang(val name: String, protected val age: Int)

class Kucing(pName: String, pAge: Int) : Binatang(pName, pAge)

/*
4. Internal -> Hak akses ini membatasi suatu anggota untuk dapat diakses hanya pada satu modul.
Hak akses ini sangat berguna ketika kita mengembangkan sebuah aplikasi yang memiliki beberapa modul di dalamnya.
 */
internal class User(val name: String)

fun main() {
    val syafiq = SayHelloPublic("Syafiq", "Fajrian", "Emha")
    println("${syafiq.firstName} ${syafiq.middleName} ${syafiq.lastName}")

    val syafiq2 = SayHelloPrivate("Syafiq", "Fajrian", "Emha")
    println(syafiq2.getFirstName())
    syafiq2.setFirstName("Budi")
    println(syafiq2.getFirstName())

    val kucing = Kucing("Eshan Miaw", 2)
    println("Nama Kucing: ${kucing.name}")
    // println("Umur Kucing: ${kucing.age}") // error: Cannot access 'age': it is protected in 'Kucing'
}