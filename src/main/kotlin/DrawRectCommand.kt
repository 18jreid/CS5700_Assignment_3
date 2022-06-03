import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size

class DrawRectCommand: Command {
    override fun execute(drawing: Drawing, offset: Offset) {
        drawing.addShape(Rectangle(Point(offset.x.toDouble(), offset.y.toDouble()), Point(offset.x.toDouble() + 100, offset.y.toDouble() + 50)))
    }
}