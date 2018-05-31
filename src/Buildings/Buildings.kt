package Buildings

open class BaseBuildingMaterial {
    open var numberNeeded: Int = 1
}

class Wood(override var numberNeeded: Int = 4) : BaseBuildingMaterial()

class Brick(override var numberNeeded: Int = 8) : BaseBuildingMaterial()

class Building<T: BaseBuildingMaterial>(var buildingMaterial: T) {
    val baseMaterialsNeeded: Int = 100
    val actualMaterialsNeeded: Int = baseMaterialsNeeded *  buildingMaterial.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}

fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) = println(if (building.actualMaterialsNeeded < 500) "small building" else "large building")

fun main(args: Array<String>) {
    Building(Wood()).build()
    isSmallBuilding(Building(Wood()))
    Building(Brick()).build()
    isSmallBuilding(Building(Brick()))
}