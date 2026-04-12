class Person (var name: String, var age: Int){
    init {
        println("Person Class Created")
    }

    constructor(name: String) : this(name, 18);

    fun printMe() {
        println("안녕하세요, 저는 ${name}이고, 나이는 ${age}세입니다!")
    }
}