package exercise4
fun main() {
    val int = listOf(1 to 5)

    val str = int.map {it.toString()}

    str.forEach{ println (it) }
}