fun main() {
    var intArr = arrayOf(1, 2, 3, 4, 5)

    var nullArr = arrayOfNulls<Int>(5)

    intArr[0] = 3
    for (i in intArr) {
        println(i)
    }

    println()

    for (item in nullArr.indices) {
        nullArr[item] = item + 1
        println(nullArr[item])
    }
}