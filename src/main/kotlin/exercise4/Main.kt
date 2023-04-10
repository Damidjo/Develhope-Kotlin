package exercise4
fun main() {
    val int = listOf(1,2,3,4,5)

    val str = int.map {it.toString()}

    str.forEach{ println (it) }
}