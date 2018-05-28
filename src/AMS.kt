import java.util.*

fun main(args: Array<String>) {
    // dayOfWeek()
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = "pallets"
    println("Today is ${day} the fish eats ${food}")
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