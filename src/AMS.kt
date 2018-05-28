import java.util.*

fun main(args: Array<String>) {
    // dayOfWeek()
    feedTheFish()
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirtiness: Int = 20): Boolean {
    return true
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is ${day} the fish eats ${food}")

    if (shouldChangeWater(day)) {
        println("Change the water today")
    }
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pallets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun dayOfWeek() {
    println("What day is it today?")

    print(when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Day not Exists"
    })
}