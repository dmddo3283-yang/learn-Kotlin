fun main() {
    b(::a)

    var c: (String) -> Unit = {
        str -> print("$str 람다함수")
    }

    b(c)
}

fun a(str: String) {
    println("$str 함수 a")
}

fun b(function: (String) -> Unit) {
    function("b가 호출함")
}