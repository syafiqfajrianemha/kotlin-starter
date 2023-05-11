package oop

/*
- Interfaces merupakan suatu konsep sifat umum yang nantinya digunakan oleh suatu kelas agar dapat memiliki sifat tersebut.
- Kelas yang mengimplementasikan sebuah interface diharuskan melakukan override seluruh
properti dan fungsi sekaligus mendefinisikan isi fungsi yang terdapat pada interfaces-nya.
- ada umumnya penamaan sebuah interface dituliskan dengan awalan huruf I kapital.
 */
interface IFly {
    fun fly()
    val numberOfWings: Int
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}

class Bird(override val numberOfWings: Int) : IFly {
    override fun fly() {
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}

fun main() {
    flyWithWings(Bird(2))

    // menggunakan anonymous class
    flyWithWings(object : IFly {
        override fun fly() {
            if(numberOfWings > 0) println("Flying with $numberOfWings wings")
            else println("I'm Flying without wings")
        }

        override val numberOfWings: Int
            get() = 2
    })
    /*
    - Perhatikan bahwa kita tidak membuat class Bird lagi, tetapi langsung mendefinisikan
    isi dari kelas tersebut dengan menggunakan keyword object.
    - Jika dilihat, memang tidak ada nama yang diberikan untuk object yang dibuat ini,
    itulah yang disebut dengan Anonymous Class.
    - Kita akan sering menemui konsep seperti ketika memasuki dunia pemrograman Android
    untuk melakukan perintah tertentu ketika ada aksi, seperti ketika tombol ditekan.
    Proses seperti ini juga sering disebut dengan listener atau callback.

    myButton.setOnClickListener(object : OnClickListener{
        override fun onClick(p0: View?) {
            //melakukan perintah tertentu
        }
    })
     */
}