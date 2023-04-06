package exercise2.interfaces

open class ChildClass : ParentInterface {
    override fun sayHi() {
        println("Hi, im the child class, my dad is an Interface")
    }
}