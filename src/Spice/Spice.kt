package Spice

sealed class Spice(var name: String, var spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

interface Grinder {
    fun grind()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor): Spice(name, spiciness, color), Grinder {
    override fun grind() {
        println("grind curry")
    }

    override fun prepareSpice() {
        grind()
    }

}