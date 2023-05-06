package functionalprogramming

import java.lang.StringBuilder

/*
mempelajari bagaimana lambda dideklarasikan dengan receiver. Konsep ini digunakan
sebagai dasar Kotlin untuk digunakan sebagai Domain Specific Languages (DSL).
Contoh sistem yang menerapkan DSL adalah Gradle dan sistem database yang berbasis SQL.
 */
fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

fun main() {
    val message = buildString {
        append("Hello ")
        append("From ")
        append(("Lambda"))
    }

    println(message)
}