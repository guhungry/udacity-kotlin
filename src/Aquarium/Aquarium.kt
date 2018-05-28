package Aquarium

import kotlin.math.PI

open class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    open var volume: Int
        get() = width * height * length / 1000
        set(value) { height = (value * 1000) / (width * height) }
    open var water: Double = volume * .9

    constructor(numberOfFish: Int): this() {
        val water = numberOfFish * 2000
        val tank = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }
}

class TowerTank() : Aquarium() {
    override var volume: Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(value) { height = (value * 1000) / (width * height) }
    override var water: Double = volume * .8
}