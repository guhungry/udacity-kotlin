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

    val curry = Curry("curry", "medium")
    println(curry)


    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
            SpiceContainer(Curry("Red Curry", "medium")),
            SpiceContainer(Curry("Green Curry", "spicy")))
    for (container in spiceCabinet) println(container.lable)
}

fun makeSalt() = SimpleSpice("salt")