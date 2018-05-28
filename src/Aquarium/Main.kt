package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
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
}
