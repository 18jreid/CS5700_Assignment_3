import androidx.compose.ui.geometry.Offset

class DrawTriangleCommand: Command {
    override fun execute(drawing: Drawing, offset: Offset) {
        drawing.addShape(Triangle(Point(offset.x.toDouble(), offset.y.toDouble()), Point(offset.x.toDouble() + 50, offset.y.toDouble()), Point(offset.x.toDouble() + 25, offset.y.toDouble() - 50)))
    }
}