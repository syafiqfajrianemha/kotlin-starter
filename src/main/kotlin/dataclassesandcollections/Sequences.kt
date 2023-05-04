package dataclassesandcollections

fun main() {
    /*
    List, Set, dan Map merupakan jenis collection yang menjalankan eager evaluation.
    Sequence merupakan collection yang bisa dikategorikan ke dalam lazy evaluation.
    Jika eager evaluation (horizontal evaluation) mengevaluasi seluruh item yang ada pada collection,
    lazy evaluation (vertical evaluation) hanya akan mengevaluasi item jika benar-benar diperlukan.
     */
    val list = (1..1_000_000).toList()

    // list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
    /*
    Dengan eager evaluation, list akan
    menyelesaikan proses filter terhadap 1 juta data baru kemudian melakukan,
    mapping data sampai akhirnya ditampilkan pada konsol.
     */


    // list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
    /*
    Dengan sequence, operasi akan dilakukan secara vertikal atau per item, misalnya dimulai angka 1.
    Karena tidak memenuhi kondisi pada filter maka operasi tidak akan dilanjutkan ke map(). Sampai
    dengan iterasi ke-5 akan dilakukan mapping, angka 5 akan dikalikan 2 dan ditampilkan pada konsol,
    setelah itu akan dilanjutkan ke iterasi berikutnya sampai dengan iterasi ke-1 juta.
     */

    // Untuk membuat objek Sequence, kita bisa menggunakan fungsi yang tersedia pada standard library yaitu generateSequence().
    // Parameter pertama adalah item pertama yang ada di dalam collection.
    // Parameter kedua adalah lambda expression berisi perubahan pada masing-masing item.
    val sequenceNumber = generateSequence(1) {it + 1}
    sequenceNumber.take(5).forEach { print("$it ") }
}