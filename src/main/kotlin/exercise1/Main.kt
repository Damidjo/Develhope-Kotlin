package exercise1

fun main() {
    for (i in 1..100 step 2) {
        if (i < 50) {
            printBelow(i)
        } else {
            printAbove(i)
        }
    }
}

fun printBelow(i : Int) {
    println("Number below: $i")
}

fun printAbove(i : Int) {
    println("Number above: $i")
}

