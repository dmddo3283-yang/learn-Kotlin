fun main() {

    var calculate: (Int, Int) -> Int = {a, b ->
        println(a)
        println(b)

        a+b
    }

    var result = calculate(3, 9)
    println("결과: $result")
}

