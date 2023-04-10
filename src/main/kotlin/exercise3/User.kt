package exercise3
//Gerarchia User
    sealed class User {
        abstract val id: String
        abstract val passwordOEmail: String?
//Subclasses
        data class Email(override val id: String, override val passwordOEmail: String?) : User()
        data class Facebook(override val id: String, override  val passwordOEmail: String?) : User()

        data class Google(override val id: String, override val passwordOEmail: String?) : User()
//F
        fun toPrintableString(): String {
            return when (this) {
                is Email -> "Email user with id $id and email ${passwordOEmail ?: "not set"}"
                is Facebook -> "Facebook user with id $id and password $passwordOEmail"
                is Google -> "Google user with id $id and password ${passwordOEmail ?: "not set"}"
            }
        }
    }



