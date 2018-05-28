package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

private fun buildAquarium() {
    val myAquarium = Aquarium(height = 30)
    println(
            "Length: ${myAquarium.length}, " +
            "Width: ${myAquarium.width}, " +
            "Height: ${myAquarium.height}"
    )
    println("Volume: ${myAquarium.volume}")
    println("Water: ${myAquarium.water}")
    myAquarium.height = 80
    println("Height: ${myAquarium.height}")
    println("Volume: ${myAquarium.volume}")
    println("Water: ${myAquarium.water}")
    val smallAquarium = Aquarium(length = 20, width =  15, height =  30)
    println("Small Aquarium: Volume = ${smallAquarium.volume}")
    val newAquarium = Aquarium(numberOfFish = 9)
    println("New Aquarium: Volume = ${newAquarium.volume}")
}

fun feedFish(fish: FishAction) {
    fish.eat()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}, Pleco: ${pleco.color}")

    feedFish(pleco)
    feedFish(shark)
}