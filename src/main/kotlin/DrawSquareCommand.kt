import androidx.compose.ui.geometry.Offset

class DrawSquareCommand: Command {
    override fun execute(drawing: Drawing, offset: Offset) {
        drawing.addShape(Square(Point(offset.x.toDouble(), offset.y.toDouble()), Point(offset.x.toDouble() + 50, offset.y.toDouble() + 50)))
    }
}