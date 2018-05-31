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
    fun addWater(cleaner: Cleaner<T>? = null) {
        if (waterSupply.needsProcessed) {
            cleaner?.clean(waterSupply)
        }

        println("adding water from ${waterSupply::class.simpleName}")
    }
}
inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalsCleaners()
    }
}

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean : ${!aquarium.waterSupply.needsProcessed}")
}

fun main(args: Array<String>) {
    val cleaner = TapWaterCleaner()
    val aquariumTap = Aquarium(TapWater())
    isWaterClean(aquariumTap)
    aquariumTap.waterSupply.addChemicalsCleaners()
    aquariumTap.addWater(cleaner)
    isWaterClean(aquariumTap)
    println(aquariumTap.hasWaterSupplyOfType<TapWater>())
    println(aquariumTap.hasWaterSupplyOfType<LakeWater>())

    val aquariumStore = Aquarium(FishStoreSupply())
    aquariumStore.addWater()

    val aquariumLake = Aquarium(LakeWater())
    aquariumLake.waterSupply.filter()
    aquariumLake.addWater()
}