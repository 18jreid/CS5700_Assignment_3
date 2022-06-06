import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

open class Pentagon(private var bottomLeft: Point): Shape() {
    override fun calculateArea(): Double? {return null}

    override fun move(deltaX: Double, deltaY: Double) {
        bottomLeft.movePoint(deltaX, deltaY)
    }

    override fun draw(scope: DrawScope) {
        // base line
        scope.drawLine(
            Brush.linearGradient(colors = listOf(Color.Blue, Color.Blue)),
            Offset(bottomLeft.getXCoordinate().toFloat(), bottomLeft.getYCoordinate().toFloat()),
            Offset(bottomLeft.getXCoordinate().toFloat() + 25, bottomLeft.getYCoordinate().toFloat())
        )

        scope.drawLine(
            Brush.linearGradient(colors = listOf(Color.Blue, Color.Blue)),
            Offset(bottomLeft.getXCoordinate().toFloat(), bottomLeft.getYCoordinate().toFloat()),
            Offset((bottomLeft.getXCoordinate().toFloat() - 12.5).toFloat(), bottomLeft.getYCoordinate().toFloat() - 25)
        )

        scope.drawLine(
            Brush.linearGradient(colors = listOf(Color.Blue, Color.Blue)),
            Offset(bottomLeft.getXCoordinate().toFloat() + 25, bottomLeft.getYCoordinate().toFloat()),
            Offset((bottomLeft.getXCoordinate().toFloat() + 37.5).toFloat(), bottomLeft.getYCoordinate().toFloat() - 25)
        )

        scope.drawLine(
            Brush.linearGradient(colors = listOf(Color.Blue, Color.Blue)),
            Offset((bottomLeft.getXCoordinate().toFloat() + 37.5).toFloat(), bottomLeft.getYCoordinate().toFloat() - 25),
            Offset((bottomLeft.getXCoordinate().toFloat() + 12.5).toFloat(), bottomLeft.getYCoordinate().toFloat() - 50)
        )

        scope.drawLine(
            Brush.linearGradient(colors = listOf(Color.Blue, Color.Blue)),
            Offset((bottomLeft.getXCoordinate().toFloat() - 12.5).toFloat(), bottomLeft.getYCoordinate().toFloat() - 25),
            Offset((bottomLeft.getXCoordinate().toFloat() + 12.5).toFloat(), bottomLeft.getYCoordinate().toFloat() - 50)
        )
    }
}