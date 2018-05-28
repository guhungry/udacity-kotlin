package Spices

import Spice.*

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