fun main() {
    var book1 = Book("자바를 자바라", 18000).apply {
        name = "[초특가] " + name
        discount()
    }

    println(book1.toString())
}

