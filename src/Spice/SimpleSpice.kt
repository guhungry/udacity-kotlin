package Spice

class SimpleSpice(var name: String, var spiciness: String = "mild") {
    val heat: Int
        get() = when(spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extremely spicy" -> 10
            else -> 0
        }
    init {
        println("Name: $name, spiciness: $spiciness, heat: $heat")
    }
}