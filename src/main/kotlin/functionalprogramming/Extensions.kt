package functionalprogramming

/*
- extension functions digunakan untuk menambahkan fungsi baru
- extension properties tentunya digunakan untuk menambahkan sebuah properti baru
 */
fun Int.printInt() {
    println("value $this")
}

fun Int.plusThree(): Int {
    return this + 3
}

// extension properties
// extension properties hanya bisa dideklarasikan dengan cara menyediakan getter atau setter secara eksplisit.
val Int.slice: Int
    get() = this / 2

fun main() {
    10.printInt()
    println(10.plusThree())

    println(10.slice)
}