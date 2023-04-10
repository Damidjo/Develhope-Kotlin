package exercise3
 fun main() {
        val emailUser = User.Email("user@example.com", "password123")
        val facebookUser = User.Facebook("123456789", "fb-token")
        val googleUser = User.Google("user@gmail.com", null)

        println(emailUser.toPrintableString())    // Output: Email user with id user@example.com and email password123
        println(facebookUser.toPrintableString()) // Output: Facebook user with id 123456789 and token fb-token
        println(googleUser.toPrintableString())   // Output: Google user with id user@gmail.com and password not set
    }


