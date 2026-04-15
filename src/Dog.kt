class Dog(name: String, age: Int) : Animal(name = name, age = age, type = "dog") {
    fun bark() {
        println("${name}: 멍멍!")
    }
}