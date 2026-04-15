class Cat(name: String, age: Int) : Animal(name = name, age = age, type = "cat") {
    fun meow() {
        println("${name}: 야옹")
    }
}