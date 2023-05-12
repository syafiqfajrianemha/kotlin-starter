package oop

import kotlin.math.PI
import kotlin.math.cosh as cosinus
import kotlin.math.sqrt as akar
import kotlin.random.Random
// import kotlin.math.* // mengimport semua

fun main() {
    val someInt = Random(0).nextInt(1, 10)

    println(someInt)
    println(PI)
    println(cosinus(120.0))
    println(akar(9.0))
}