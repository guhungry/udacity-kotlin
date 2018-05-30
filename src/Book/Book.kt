package Book

const val maxBorrow = 3

open class Book(var title: String, var author: String, var year: String) {
    private var currentPage: Int = 0
    private var borrow: Int = 0
    var pages = 1000

    open fun readPage() {
        currentPage++
    }

    fun infoTitleAuthor(): Pair<String, String> {
        return title to author
    }

    fun infoTitleAuthorYear() : Triple<String, String, String> {
        return Triple(title, author, year)
    }

    fun canBorrow() : Boolean {
        return borrow < maxBorrow
    }

    fun printUrl() : String {
        return "$BASE_URL/$title.html"
    }

    companion object {
        const val BASE_URL = "https://guhungry.com/books"
    }
}

fun Book.weight() : Double = pages * 1.5
fun Book.tornPages (torn : Int) = if (pages > torn) pages -= torn else pages = 0

class eBook(title: String, author: String, year: String, var format: String = "text") : Book(title, author, year) {
    private var wordCount: Int = 0
    override fun readPage() {
        wordCount += 250
    }
}