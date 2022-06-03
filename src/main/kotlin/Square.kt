import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

class Square(pointOne: Point, pointTwo: Point) : Rectangle(pointOne, pointTwo) {
    // Check if width and height are equal
    init {
        if (getWidth() != getHeight()) {
            throw IllegalArgumentException("Square width and height are not equal, therefore it isn't a square!")
        }
    }
}