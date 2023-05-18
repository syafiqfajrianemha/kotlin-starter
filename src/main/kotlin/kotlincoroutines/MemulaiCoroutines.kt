package kotlincoroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        // menunda kode berikutnya selama 3 detik
        delay(3000L)
        println("Coroutines!")
    }
    println("Hello,")
    // menunda selama 5 detik sebelum JVM berakhir
    delay(5000L)
}