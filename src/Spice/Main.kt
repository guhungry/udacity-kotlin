package Spice

fun main(args: Array<String>) {
    val spice = makeSalt()
    println("Name: ${spice.name}, Heat: ${spice.heat}")
    val spices1 = listOf(
            SimpleSpice("curry", "mild"),
            SimpleSpice("pepper", "medium"),
            SimpleSpice("cayenne", "spicy"),
            SimpleSpice("ginger", "mild"),
            SimpleSpice("red curry", "medium"),
            SimpleSpice("green curry", "mild"),
            SimpleSpice("hot pepper", "extremely spicy")
    )
    val spicelist = spices1.filter {it.heat < 5}
    println(spicelist)
}

fun makeSalt() = SimpleSpice("salt")