open class Ellipse(private var centerPoint: Point, private var horizontalRadius: Double, private var verticalRadius: Double): Shape() {
    // Checks if the area is greater than 0, if not throw an error
    init {
        if (calculateArea() <= 0.0) {
            throw IllegalArgumentException("Horizontal and vertical radii must be greater than 0")
        }
    }

    /***
     * returns the center point for the ellipse
     */
    fun getCenterPoint(): Point {
        return this.centerPoint
    }

    /***
     * returns the horizontal radius for the ellipse
     */
    fun getHorizontalRadius(): Double {
        return this.horizontalRadius
    }

    /***
     * returns the vertical radius for the ellipse
     */
    fun getVerticalRadius(): Double {
        return this.verticalRadius
    }

    /***
     *
     * Calculates area of circle with formula pi * radius^2
     */
    final override fun calculateArea(): Double {
        return Math.PI * horizontalRadius * verticalRadius
    }

    /***
     * Moves circle based off of desired deltaX and deltaY
     */
    override fun move(deltaX: Double, deltaY: Double) {
        this.centerPoint.movePoint(deltaX, deltaY)
    }
}