interface ParentInterface {
    fun speak()
}

class Child : ParentInterface {
    override fun speak() {
        println("Child interfaces")
    }
}

class Child2 : ParentInterface {
    override fun speak() {
        println("Child interfaces number two!")
    }
}

