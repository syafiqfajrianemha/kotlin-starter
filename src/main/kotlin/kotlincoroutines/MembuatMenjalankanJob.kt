package kotlincoroutines

import kotlinx.coroutines.*

/*
Job dapat diinisialisasikan menggunakan fungsi launch() maupun Job()

//menggunakan launch():
fun main() = runBlocking {
    val job = launch {
        // Do background task here
    }
}

//menggunakan Job():
fun main() = runBlocking {
    val job = Job()
}
 */

fun main() = runBlocking {
    // Setelah diinisialisasikan, job akan memiliki state New dan akan langsung dijalankan.
    // CoroutineStart.LAZY -> membuat job tidak langsung dijalankan
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    // menjalankan job menggunakan fungsi start() atau join()
    // start() akan memulai job tanpa harus menunggu job tersebut selesai, sedangkan
    // join() akan menunda eksekusi sampai job selesai.
    // job.start()
    job.join()
    println("Other task")
}