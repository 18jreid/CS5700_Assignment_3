import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import kotlin.math.abs

class Triangle(private var vertexOne: Point, private var vertexTwo: Point, private var vertexThree: Point): Shape() {
    init {
        if (calculateArea() <= 0) {
            throw IllegalArgumentException("Not a valid triangle")
        }
    }

    /***
     * returns vertex one of triangle
     */
    fun getVertexOne(): Point {
        return this.vertexOne
    }

    /***
     * returns vertex two of the triangle
     */
    fun getVertexTwo(): Point {
        return this.vertexTwo
    }

    /***
     * returns vertex three of the triangle
     */
    fun getVertexThree(): Point {
        return this.vertexThree
    }

    /***
     * returns the area of the triangle
     */
    override fun calculateArea(): Double {
        return abs(0.5 * ((vertexTwo.getXCoordinate() - vertexOne.getXCoordinate()) * (vertexThree.getYCoordinate() - vertexOne.getYCoordinate()) - (vertexThree.getXCoordinate() - vertexOne.getXCoordinate()) * (vertexTwo.getYCoordinate() - vertexOne.getYCoordinate())))
    }

    /***
     * moves the triangle based off of the desired deltaX and deltaY units
     */
    override fun move(deltaX: Double, deltaY: Double) {
        vertexOne.movePoint(deltaX, deltaY)
        vertexTwo.movePoint(deltaX, deltaY)
        vertexThree.movePoint(deltaX, deltaY)
    }

    override fun draw(scope: DrawScope) {
        scope.drawLine(
            Brush.linearGradient(colors = listOf(Color.Blue, Color.Blue)),
            Offset(vertexOne.getXCoordinate().toFloat(), vertexOne.getYCoordinate().toFloat()),
            Offset(vertexTwo.getXCoordinate().toFloat(), vertexTwo.getYCoordinate().toFloat()),
            )
        scope.drawLine(
            Brush.linearGradient(colors = listOf(Color.Blue, Color.Blue)),
            Offset(vertexTwo.getXCoordinate().toFloat(), vertexTwo.getYCoordinate().toFloat()),
            Offset(vertexThree.getXCoordinate().toFloat(), vertexThree.getYCoordinate().toFloat()),
        )
        scope.drawLine(
            Brush.linearGradient(colors = listOf(Color.Blue, Color.Blue)),
            Offset(vertexThree.getXCoordinate().toFloat(), vertexThree.getYCoordinate().toFloat()),
            Offset(vertexOne.getXCoordinate().toFloat(), vertexOne.getYCoordinate().toFloat()),
        )
    }
}