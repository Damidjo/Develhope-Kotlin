fun main() {
    for (i in 1..100 step 2) {
        if (i < 50) {
            printFirst(i)
        } else {
            printSecond(i)
        }
    }
}

fun printFirst(i : Int) {
    println("Number below: $i")
}

fun printSecond(i : Int) {
    println("Number above: $i")
}

