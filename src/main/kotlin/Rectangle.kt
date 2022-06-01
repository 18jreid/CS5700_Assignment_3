import kotlin.math.abs

open class Rectangle(private var pointOne: Point, private var pointTwo: Point): Shape() {
    // Check if rectangles width and height are greater than 0, if not: throw IllegalArgumentException
    init {
        if (getWidth() <= 0) {
            throw IllegalArgumentException("Width cannot be 0")
        } else if (getHeight() <= 0) {
            throw IllegalArgumentException("Height cannot be 0")
        }
    }

    /***
     * returns top right corner point of rectangle
     */
    fun getPointOne(): Point {
        return this.pointOne
    }

    /***
     * returns bottom left corner point of rectangle
     */
    fun getPointTwo(): Point {
        return this.pointTwo
    }

    /***
     * calculates the width of the rectangle based off of the change in x between the two points given
     */
    fun getWidth(): Double {
        return abs(this.pointOne.getXCoordinate() - this.pointTwo.getXCoordinate());
    }

    /***
     * calculates the height of the rectangle based off of the change in y between the two points given
     */
    fun getHeight(): Double {
        return abs(this.pointOne.getYCoordinate() - this.pointTwo.getYCoordinate());
    }

    /***
     *
     * Calculates area of rectangle with formula base times height
     */
    override fun calculateArea(): Double {
        return (this.getWidth() * this.getHeight())
    }

    /***
     * Moves rectangle based off of desired deltaX and deltaY
     */
    override fun move(deltaX: Double, deltaY: Double) {
        this.pointOne.movePoint(deltaX, deltaY)
        this.pointTwo.movePoint(deltaX, deltaY)
    }
}