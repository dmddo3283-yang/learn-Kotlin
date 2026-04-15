class Dog : Runner, Eater {
    override fun run() {
        println("개가 달립니다.")
    }

    override fun eat() {
        println("개껌을 먹습니다.")
    }
}