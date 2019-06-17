/* List<User> allows to know on what object this function is applicable
 * ... : User is the type of return */

inline fun List<User>.maxUser(lambda: (User) -> Int): User {
    var max = this.first()
    for (user in this) {
        if (lambda(max) < lambda(user)) {
            max = user
        }
    }
    return max
}