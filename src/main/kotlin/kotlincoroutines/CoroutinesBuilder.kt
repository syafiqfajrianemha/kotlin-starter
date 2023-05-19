package kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/*
- runBlocking dan launch merupakan coroutines builder, yaitu sebuah fungsi yang mengambil suspending
lambda dan membuat coroutine untuk menjalankannya.

1. launch -> fungsi ini digunakan untuk memulai sebuah coroutines yang tidak akan mengembalikan sebuah hasil.
launch akan menghasilkan Job yang bisa kita gunakan untuk membatalkan eksekusi.
2. runBlocking -> Fungsi ini dibuat untuk menjembatani blocking code menjadi kode yang dapat ditangguhkan.
runBlocking akan memblokir sebuah thread yang sedang berjalan hingga eksekusi coroutine selesai.
3. async -> Kebalikan dari launch, fungsi ini digunakan untuk memulai sebuah coroutine
yang akan mengembalikan sebuah hasil.
 */
suspend fun getCapital(): Int {
    delay(1000L)
    return 50_000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75_000
}

fun main() = runBlocking {
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    println("Completed in $timeOne ms vs $timeTwo ms")
    println("async bisa selesai hampir 2 kali lebih cepat dibandingkan tanpa async")
}