fun main(args: Array<String>) {
    val users: List<User> = listOf(
        User("Jonathan", 22, 2),
        User("Maxime", 21, 0),
        User("Florent", 21, 5)
    )

    println(users.maxUser(User::experience))
    println(users.maxUser(User::age))
}