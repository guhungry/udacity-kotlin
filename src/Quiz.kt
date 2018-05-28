fun main(args: Array<String>) {
    helloKotlin(args[0])

    var fortune : String
    for (i in 1..10) {
        fortune = getFortuneCookie()
        println("Your fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun getFortuneCookie() : String {
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
        28,31 -> 4
        in 1..7 -> 2
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[index]
}

fun helloKotlin(hour: String) {
    println(if (hour.toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin")
}
