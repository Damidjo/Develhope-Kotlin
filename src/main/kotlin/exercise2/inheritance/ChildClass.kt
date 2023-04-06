package exercise2.inheritance

class ChildClass : ParentClass() {
    override fun sayHi() {
        super.sayHi()
        println("Hi, im the child class")
    }
}