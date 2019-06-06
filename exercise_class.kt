//compile the kotlin code using the kotlin compiler:
//kotlinc test.kt -include-runtime -d test.jar

//run the kotlin code on jvm using the java command:
//java -jar test.jar

class Course (private val id: Int, var title: String, val duration: Int, var isActive: Boolean) {

}

fun main(args: Array<String>) {
    var course = Course (185979, "Class on Kotlin", 22, true)

    println("Check out my new course: ${course.title}")
}