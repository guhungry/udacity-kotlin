package Book

open class Book(var title: String, var author: String) {
    private var currentPage: Int = 0
    open fun readPage() {
        currentPage++
    }
}

class eBook(title: String, author: String, var format: String = "text") : Book(title, author) {
    private var wordCount: Int = 0
    override fun readPage() {
        wordCount += 250
    }
}