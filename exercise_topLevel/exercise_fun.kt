const val GOOGLE = "ABCDE_IS_MY_TOKEN"
const val OPENCLASSROOM = "https://www.openclassrooms.com"

fun isNotNull(message: String?) = when {
    message == null -> throw Exception("This variable is null!")
    else -> println("This variable is not null!")
}