private fun while20Items() {
    var i: Int = 0
    while (i < 20) {
        println("$i")
        ++i
    }
}

private fun showArrayContent(tab: Array<String>) {
    for (e in tab) {
        println(e)
    }
}

fun main(args: Array<String>) {
    val example: Array<String> = arrayOf("CHU Jonathan", "KUOCH Maxime", "SIMONNOT Florent")

    while20Items()
    showArrayContent(example)
}
