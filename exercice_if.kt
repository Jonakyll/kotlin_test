//compile the kotlin code using the kotlin compiler:
//kotlinc test.kt -include-runtime -d test.jar

//run the kotlin code on jvm using the java command:
//java -jar test.jar

private fun minOf(a: Int, b: Int) = (if (a < b) a else b) * 10

private enum class RGB{
    Red,
    Green,
    Blue
}

private fun colorToString(color: RGB) = when (color) {
    RGB.Red -> "RED"
    RGB.Green -> "GREEN"
    RGB.Blue -> "BLUE"
}

fun main(args: Array<String>) {
    val a: Int = 22
    val b: Int = 20

    var smallest_of_two = minOf(a, b)
    println("${smallest_of_two}")

    println("${colorToString(RGB.Red)}")
    println("${colorToString(RGB.Green)}")
    println("${colorToString(RGB.Blue)}")
}