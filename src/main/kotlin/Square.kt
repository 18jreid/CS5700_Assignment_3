class Square(pointOne: Point, pointTwo: Point) : Rectangle(pointOne, pointTwo) {
    // Check if width and height are equal
    init {
        if (getWidth() != getHeight()) {
            throw IllegalArgumentException("Square width and height are not equal, therefore it isn't a square!")
        }
    }
}