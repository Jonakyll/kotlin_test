private fun guessTheType(surprise: Any) = when(surprise) {
    is Int -> println("Int")
    is String -> println("String")
    is List<*> -> println("List")
    is Boolean -> println("Boolean")
    is Array<*> -> println("Array")
    else -> println("Error!")
}

fun main(args: Array<String>) {
    val num: Int = 22;
    val str: String = "Bonjour"
    val lst: List<Int> = listOf(1, 2, 3, 4, 5)
    val bool: Boolean = true
    val arr: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    guessTheType(num)
    guessTheType(str)
    guessTheType(lst)
    guessTheType(bool)
    guessTheType(arr)
    guessTheType(1.0)

}