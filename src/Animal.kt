open class Animal(var name: String, var age: Int, var type: String) {
    fun introduce() {
        println("저는 ${name} ${age}이고, ${type}살입니다.")
    }
}