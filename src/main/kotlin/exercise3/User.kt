package exercise3
    sealed class User {
        abstract val id: String
        abstract val passwordOrEmail: String?

        data class Email(override val id: String, override val passwordOrEmail: String?) : User()
        data class Facebook(override val id: String, val token: String) : User() {
            override val passwordOrEmail: String?
                get() = null
        }

        data class Google(override val id: String, override val passwordOrEmail: String?) : User()

        fun toPrintableString(): String {
            return when (this) {
                is Email -> "Email user with id $id and email ${passwordOrEmail ?: "not set"}"
                is Facebook -> "Facebook user with id $id and token $token"
                is Google -> "Google user with id $id and password ${passwordOrEmail ?: "not set"}"
            }
        }
    }



