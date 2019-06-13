data class User(var email: String,
                var password: String,
                var urlImage: String?) {

    companion object {
        fun newInstance(email: String, password: String) = User(email, password, null)
    }

}