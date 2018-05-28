package Aquarium

abstract class AquariumFish {
    abstract val color: String
}

interface FishAction {
    fun eat()
}

class Shark() : AquariumFish(), FishAction {
    override val color: String = "grey"

    override fun eat() {
        println("Hunt and eat fish")
    }
}

class Plecostomus(): AquariumFish(), FishAction {
    override val color: String = "gold"

    override fun eat() {
        println("munch an algae")
    }
}