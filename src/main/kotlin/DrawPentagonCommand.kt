import androidx.compose.ui.geometry.Offset

class DrawPentagonCommand: Command {
    override fun execute(drawing: Drawing, offset: Offset) {
        drawing.addShape(Pentagon(Point(offset.x.toDouble(), offset.y.toDouble())))
    }
}