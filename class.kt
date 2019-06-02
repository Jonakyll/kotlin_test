//compile the kotlin code using the kotlin compiler:
//kotlinc test.kt -include-runtime -d test.jar

//run the kotlin code on jvm using the java command:
//java -jar test.jar

class User (email: String, private var password: String, var age: Int) {

    var email: String = email
        get() {println("User is getting his email."); return field}
        set(value) {println("User is setting his email."); field = value}
}

fun main() {
    val user = User("jchu97@hotmail.com", "jc22janvmil997", 22)
    user.age = 23

    println(user.age)
}