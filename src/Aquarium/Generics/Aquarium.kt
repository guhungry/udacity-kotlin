package Aquarium.Generics

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalsCleaners() {
        needsProcessed = false
    }
}

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

class FishStoreSupply : WaterSupply(false)

class Aquarium<T: WaterSupply> (var waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessed) { "Water needs processed" }
    }
}

fun main(args: Array<String>) {
    val aquariumTap = Aquarium(TapWater())
    aquariumTap.waterSupply.addChemicalsCleaners()
    aquariumTap.addWater()


    val aquariumStore = Aquarium(FishStoreSupply())
    aquariumStore.addWater()

    val aquariumLake = Aquarium(LakeWater())
    aquariumLake.waterSupply.filter()
    aquariumLake.addWater()
}