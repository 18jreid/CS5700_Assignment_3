import androidx.compose.ui.geometry.Offset

class DrawEllipseCommand: Command {
    override fun execute(drawing: Drawing, offset: Offset) {
        drawing.addShape(Ellipse(Point(offset.x.toDouble(), offset.y.toDouble()), 25.0, 50.0))
    }
}