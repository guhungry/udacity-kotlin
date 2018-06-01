package Game

class Location(var width: Int = 4, var height: Int = 4) {
    val map = Array(width) { arrayOfNulls<String>(height) }
}