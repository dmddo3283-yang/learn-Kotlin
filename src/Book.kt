data class Book(var name: String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}