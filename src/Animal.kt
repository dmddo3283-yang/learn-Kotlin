open abstract class Animal {
    open fun eat() {
        println("음식을 먹습니다.")
    }

    abstract fun move()
}