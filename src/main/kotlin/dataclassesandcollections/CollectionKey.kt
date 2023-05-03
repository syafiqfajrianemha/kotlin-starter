package dataclassesandcollections

fun main() {
    /*
    Map, yakni sebuah collection yang dapat menyimpan data dengan format key-value.
     */
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    println(capital["Amsterdam"])
    println(capital.getValue("London"))

    // menampilkan key apa saja yang ada di dalam Map
    val mapKeys = capital.keys
    println(mapKeys)

    // menampilkan nilai apa saja yang ada di dalam Map
    val mapValues = capital.values
    println(mapValues)

    // secara default map immutable
    // jika kita ingin menambah key-value kita harus mengubahnya menjadi mutable
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
    println(mutableCapital.values)

    // Namun perlu diperhatikan bahwa menggunakan mutable collection itu tidak disarankan.
    // Sebaiknya gunakan immutable sebisa mungkin, jika memang dibutuhkan untuk diubah, baru gunakan mutable.
}