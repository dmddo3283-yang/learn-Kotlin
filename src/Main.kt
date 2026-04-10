fun main() {
    doWhen("양정우")
}

fun doWhen(a: Any) {
    when(a) {
        is Int -> println("$a: 정수형입니다")
        is Double -> println("$a: 실수형입니다")
        is Long -> println("$a: 와우 길다")
        is Any -> println("$a: 정우입니다")
    }
}