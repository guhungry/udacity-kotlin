package Book

fun main(args: Array<String>) {
    val book = Book(title = "Kotlin", author = "JetBrains", year =  "2000")

    val titleAuthor = book.infoTitleAuthor()
    println("Here is your book ${titleAuthor.first} written by ${titleAuthor.second}")
    val titleAuthorYear = book.infoTitleAuthorYear()
    println("Here is your book ${titleAuthorYear.first} written by ${titleAuthorYear.second} in ${titleAuthorYear.third}")
}