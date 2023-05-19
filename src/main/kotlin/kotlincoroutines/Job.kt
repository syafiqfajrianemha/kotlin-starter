package kotlincoroutines

/*
Job adalah sebuah hasil dari perintah asynchronous yang dijalankan.
Sebuah job akan memiliki 3 (tiga) properti yang nantinya bisa dipetakan ke dalam setiap state atau keadaan.

1. isActive -> Sebuah properti yang menunjukkan ketika sebuah job sedang aktif.
2. isCompleted -> Sebuah properti yang menunjukkan ketika sebuah job telah selesai.
3. isCancelled -> Sebuah properti yang menunjukkan ketika sebuah job telah dibatalkan.

- New -> Keadaan di mana sebuah job telah diinisialisasi namun belum pernah dijalankan.
- Active -> Sebuah job akan memiliki status aktif ketika ia sedang berjalan.
Dalam hal ini, job yang sedang ditangguhkan (suspended job) juga termasuk ke dalam job yang aktif.
- Completed -> Ketika job sudah tidak berjalan lagi. Ini berlaku untuk job yang berakhir secara
normal, dibatalkan, ataupun karena suatu pengecualian.
- Cancelling -> Suatu kondisi ketika fungsi cancel() dipanggil pada job yang sedang aktif dan
memerlukan waktu untuk pembatalan tersebut selesai.
- Cancelled -> Keadaan yang dimiliki oleh sebuah job yang sudah berhasil dibatalkan.
Perlu diketahui bahwa job yang dibatalkan juga dapat dianggap sebagai Completed job.
 */
fun main() {
    println("Job")
}