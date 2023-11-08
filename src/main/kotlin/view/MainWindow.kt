package view

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import kotlin.system.exitProcess

class MainWindow {
    @Composable
    fun show() = Window(
        onCloseRequest = { exitProcess(0) },
        title = "ENIGMA"
    ) {
        
    }
}