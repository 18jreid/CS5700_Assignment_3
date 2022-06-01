class Circle(centerPoint: Point, horizontalRadius: Double, verticalRadius: Double) : Ellipse(centerPoint, horizontalRadius, verticalRadius) {
    // Checks if horizontal and vertical radii are equal, if not it is not a circle!
    init {
        if (horizontalRadius != verticalRadius) {
            throw IllegalArgumentException("Horizontal and vertical radii are not equal, therefore not a circle")
        }
    }
}