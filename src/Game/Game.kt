package Game

class Game {
    var path = mutableListOf(Directions.START)

    val north = { path.add(Directions.NORTH) }
    val east = { path.add(Directions.EAST) }
    val south = { path.add(Directions.SOUTH) }
    val west = { path.add(Directions.WEST) }
    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        path.add(Directions.START)
        false
    }

    fun move(where: () -> Boolean) {
        where()
    }

    fun makeMove(direction: String?) {
        move(when (direction) {
            "s" -> south
            "n" -> north
            "w" -> west
            "e" -> east
            else -> end
        })
    }
}

fun main(args: Array<String>) {
    val game = Game()
    while (true) {
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }
}