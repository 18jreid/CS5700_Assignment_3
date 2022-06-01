import kotlin.math.pow
import kotlin.math.sqrt

class Line(private var startPoint: Point, private var endPoint: Point) {
    // Check if line length is less than zero, if so: throw error
    init {
        if (getLength() <= 0) {
            throw IllegalArgumentException("Line length is less that zero")
        }
    }

    /***
     * returns the start point of the line
     */
    fun getStartPoint(): Point {
        return this.startPoint
    }

    /***
     * returns the end point of the line
     */
    fun getEndPoint(): Point {
        return this.endPoint
    }

    /***
     * calculates and returns the slope of the line using the slope formula (y_2 - y_1) / (x_2 - x_1)
     *
     * returns: slope of type Double
     */
    fun getSlope(): Double {
        val numerator = this.endPoint.getYCoordinate() - this.startPoint.getYCoordinate();
        val denominator = this.endPoint.getXCoordinate() - this.startPoint.getXCoordinate();

        return numerator / denominator;
    }

    /***
     * calculates and returns the length of the line using the distance formula sqrt((x_2^2 - x_1^2) + (y_2^2 - y_1^2))
     *
     * returns: length of type Double
     */
    fun getLength(): Double {
        val x = (this.endPoint.getXCoordinate() - this.startPoint.getXCoordinate()).pow(2);
        val y = (this.endPoint.getYCoordinate() - this.startPoint.getYCoordinate()).pow(2);

        return sqrt(x + y);
    }

    /***
     * moves the line according to deltaX and deltaY values
     */
    fun moveLine(deltaX: Double, deltaY: Double) {
        this.endPoint.movePoint(deltaX, deltaY)
        this.startPoint.movePoint(deltaX, deltaY)
    }
}