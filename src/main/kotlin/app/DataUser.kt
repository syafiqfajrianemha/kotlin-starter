package app

data class DataUser(val name: String, val age: Int) {
    fun intro() {
        println("My name is ${this.name}, I am ${this.age} years old.")
    }
}
