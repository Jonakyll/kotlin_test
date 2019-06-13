fun main(args: Array<String>) {
    val user = User.newInstance("jchu97@hotmail.com", "azertyuiop")
    val button = Button()
    val circleButton = CircleButton()

    println(user)
    println("user log: ${user.email}, ${user.password}, ${user.urlImage}")
}