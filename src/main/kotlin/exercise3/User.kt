package exercise3

sealed class User(open val id : String) {
    data class Email(override val id : String) : User("1")
    data class Facebook(override val id : String) : User("1")
    data class Google(override val id : String) : User("1")

    class Method {
        fun text(user: User): String {
            return when (user) {
                is Email -> {
                    "Default Email user: ${user.id}"
                }

                is Facebook -> {
                    "Facebook user: ${user.id}"
                }

                is Google -> {
                    "Google user: ${user.id}"
                }
            }
        }
    }
}


