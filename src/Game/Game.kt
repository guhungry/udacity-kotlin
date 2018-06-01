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
        false
    }
}

fun main(args: Array<String>) {
    val game = Game()
    println(game.path)
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    println(game.path)
}