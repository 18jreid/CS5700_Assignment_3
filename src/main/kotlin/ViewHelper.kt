import androidx.compose.ui.geometry.Offset

class ViewHelper(val drawing: Drawing) {
    private var command: Command = NoopCommand()

    fun setCommand(command: Command) {
        this.command = command
    }

    fun executeCommand(offset: Offset) {
        command.execute(drawing, offset)
    }
}