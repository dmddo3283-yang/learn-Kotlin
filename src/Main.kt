fun main() {
    var arr: Array<Int> = arrayOf(1,2,3)
    println(sum(arr))
}

fun sum(arr: Array<Int>): Int {
    var sum = 0
    for (i in arr.indices) {
        sum += arr[i]
    }
    return sum
}