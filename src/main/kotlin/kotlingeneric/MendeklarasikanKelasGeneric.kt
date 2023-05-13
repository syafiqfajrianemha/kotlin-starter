package kotlingeneric

// tipe parameter T bisa kita gunakan sebagai tipe reguler yang mengembalikan tipe dari sebuah fungsi.
interface List<T> {
    operator fun get(index: Int): T
}

// jika kita mempunyai sebuah kelas yang mewarisi kelas atau interface generic,
// maka kita perlu menentukan tipe argumen sebagai tipe dasar dari parameter generic kelas tersebut.
class LongList : List<Long> {
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

fun main() {
    val longArrayList = ArrayList<Long>()
    val fisrtLong = longArrayList.get(0)
}