import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

class Circle(centerPoint: Point, horizontalRadius: Double, verticalRadius: Double) : Ellipse(centerPoint, horizontalRadius, verticalRadius) {
    // Checks if horizontal and vertical radii are equal, if not it is not a circle!
    init {
        if (horizontalRadius != verticalRadius) {
            throw IllegalArgumentException("Horizontal and vertical radii are not equal, therefore not a circle")
        }
    }

    override fun draw(scope: DrawScope) {
        scope.drawCircle(
            center = Offset(getCenterPoint().getXCoordinate().toFloat(), getCenterPoint().getYCoordinate().toFloat()),
            radius = getHorizontalRadius().toFloat(),
            color = Color.Blue
        )
    }
}