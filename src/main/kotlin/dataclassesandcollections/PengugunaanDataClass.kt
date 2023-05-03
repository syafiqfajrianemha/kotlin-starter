package dataclassesandcollections

class User(val name: String, val age: Int) {
    // jika tanpa data class kita harus membuat fungsi toString() secara manual untuk mendapatkan informasi seperti yang diberikan oleh objek dataUser
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name: String, val age: Int)

fun main() {
    val user = User("Syafiq", 19)
    val user2 = User("Syafiq", 19)
    val user3 = DataUser("Joko", 24)
    // tanpa data class kita harus meng-override fungsi equals() yang sangat ribet
    println(user.equals(user2))
    println(user.equals(user3))

    val dataUser = DataUser("Syafiq", 19)
    val dataUser2 = DataUser("Syafiq", 19)
    val dataUser3 = DataUser("Joko", 24)
    // data class sudah memiliki fungsi equals() secara otomatis
    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

    println(user)
    println(dataUser)
}