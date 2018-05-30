package Book

fun main(args: Array<String>) {
    learnPairAndTriplet()
    learnCollections()
}

fun learnCollections() {
    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val library = mapOf("William Shakespeare" to allBooks)
    println(library)
    println(library.any { it.value.contains("Hamlet") })

    var moreBooks = mutableMapOf("Bee" to setOf("Guhungry"))
    moreBooks.getOrPut("Baka", { setOf("Aloha") })
    println(moreBooks)
}

private fun learnPairAndTriplet() {
    val book = Book(title = "Kotlin", author = "JetBrains", year = "2000")

    val titleAuthor = book.infoTitleAuthor()
    println("Here is your book ${titleAuthor.first} written by ${titleAuthor.second}")
    val titleAuthorYear = book.infoTitleAuthorYear()
    println("Here is your book ${titleAuthorYear.first} written by ${titleAuthorYear.second} in ${titleAuthorYear.third}")
}