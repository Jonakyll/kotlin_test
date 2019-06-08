private fun isUserOld(age: Int) = when {
    age > 100 -> throw Exception("too old!")
    age > 65 -> true
    age < 0 -> throw Exception("too young:")
    else -> false
}

fun main(args: Array<String>) {
    val age: Int = 22;

    println(isUserOld(age))
}