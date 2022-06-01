import androidx.compose.ui.geometry.Offset

class DrawCircleCommand: Command {
    override fun execute(drawing: Drawing, offset: Offset) {
        drawing.addShape(Circle(Point(offset.x.toDouble(), offset.y.toDouble()), 25.0, 25.0))
    }
}