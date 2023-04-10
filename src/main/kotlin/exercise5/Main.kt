package exercise5

fun List<Int>.filterByValue(value: Int): List<Int> {
    return this.filter { it < value }
}

fun List<Int>.printValues() {
    this.forEach { println(it) }
}

fun main() {
    val myList = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000)

    val filteredList = myList.filterByValue(600)

    filteredList.printValues()
}
