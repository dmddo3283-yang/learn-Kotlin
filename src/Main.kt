class Book(var name: String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}

fun Book.checkStock(): Boolean {
    println(">>> '${this.name}'의 재고를 확인 중입니다...")
    return true // 항상 재고가 있다고 가정
}

fun main() {
    var price = 20000

    var book1 = Book("자바를 자바라", 18000).apply {
        name = "[초특가] " + name
        discount()
    }.also {
        println("로그: 객체 생성 및 초기화 완료 (${it.name})")
    }

    book1.run {
        println("상품명: ${name}, 가격: ${this.price}원")
    }

    book1.let {
        println("상품명: ${it.name}, 할인가: ${it.price}원 (원래 가격: ${price}원)")
    }

    if (book1.checkStock()) {
        println("판매 가능 상품입니다.")
    }
}
