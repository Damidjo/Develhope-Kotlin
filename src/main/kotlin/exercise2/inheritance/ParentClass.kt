package exercise2.inheritance

open class ParentClass {
    open fun speak() {}
}

class Child : ParentClass() {
    override fun speak() {
        println("im the child class")
    }
}

class Child2 : ParentClass() {
    override fun speak() {
        println("im the child class number two")
    }
}

