package Book

open class Book(var title: String, var author: String, var year: String) {
    private var currentPage: Int = 0
    open fun readPage() {
        currentPage++
    }

    fun infoTitleAuthor(): Pair<String, String> {
        return title to author
    }

    fun infoTitleAuthorYear() : Triple<String, String, String> {
        return Triple(title, author, year)
    }
}

class eBook(title: String, author: String, year: String, var format: String = "text") : Book(title, author, year) {
    private var wordCount: Int = 0
    override fun readPage() {
        wordCount += 250
    }
}