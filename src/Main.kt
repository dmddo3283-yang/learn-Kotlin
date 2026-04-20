fun main() {
    var book1 = Book("자바를 자바라", 18000).apply {
        name = "[초특가] " + name
        discount()
    }

    book1.run {
        println("상품명: ${name}, 가격: ${price}원")
    }

    println(book1.toString())
}

