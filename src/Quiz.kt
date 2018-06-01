fun main(args: Array<String>) {
    /*
    helloKotlin(args[0])

    var fortune : String = ""
    while (!fortune.contains("Take it easy")) {
        fortune = getFortuneCookie()
        println("Your fortune is: $fortune")
    }

    println(whatShouldIDoToday(readLine()!!, "Sunny"))
    */

    higherOrderFunction()
}

fun higherOrderFunction() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(numbers.divisibleBy { it.rem(3) })

}

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}

fun whatShouldIDoToday(mood: String, weather: String = "Sunny", temperature: Int = 24): String {
    return when {
        shouldGoForWalk(mood, weather) -> "go for a walk"
        shouldStayInBed(mood, weather, temperature) -> "stay in bed"
        shouldGoSwimming(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun shouldGoSwimming(temperature: Int) = temperature > 35
fun shouldStayInBed(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun shouldGoForWalk(mood: String, weather: String) = mood == "happy" && weather == "Sunny"


fun getFortuneCookie(): String {
    val birthday = getBirthday()
    return getFortune(birthday)
}

fun getBirthday(): Int {
    print("Enter your birthday:")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune."
    )
    val index = when (birthday) {
        28, 31 -> 4
        in 1..7 -> 2
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[index]
}

fun helloKotlin(hour: String) {
    println(if (hour.toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin")
}
