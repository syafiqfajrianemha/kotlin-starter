package kotlincoroutines

import kotlinx.coroutines.*

/*
Hanya job yang sedang aktif yang dapat dibatalkan.
Kita bisa melakukannya dengan memanggil fungsi cancel().
 */
@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000L)
        println("Start new job!")
    }

    delay(2000L)
    // job.cancel()
    // parameter cause yang bisa digunakan untuk memberitahu kenapa sebuah job dibatalkan.
    job.cancel(cause = CancellationException("Time is up!"))
    println("Cancelling job...")
    if(job.isCancelled) {
        // println("Job is cancelled")
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
    /*
    sebuah job membutuhkan waktu 5 detik untuk dijalankan. Namun ketika mencapai waktu 2 detik,
    job tersebut telah dibatalkan. Saat fungsi cancel() dipanggil, job akan memasuki state Cancelling
    sampai pembatalan tersebut berhasil. Kemudian setelah pembatalan berhasil,
    job akan memiliki state Cancelled dan Completed.

    jika cancel() dipanggil dalam job baru yang belum dijalankan, job tersebut tidak akan melalui
    state Cancelling, melainkan akan langsung memasuki state Cancelled.
     */
}