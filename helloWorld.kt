//compile the kotlin code using the kotlin compiler:
//kotlinc test.kt -include-runtime -d test.jar

//run the kotlin code on jvm using the java command:
//java -jar test.jar
const val question: String = "What is your name?"

fun main(args: Array<String>) {

    println("Hello World!")

    lateinit var anwser: String
    anwser = "Jonathan"

    println("Hello $anwser")
}