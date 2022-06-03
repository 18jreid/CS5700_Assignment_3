// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    val drawing = remember { Drawing() }
    val viewHelper = remember { ViewHelper(drawing) }
    var scale = remember { mutableStateOf("1") }

    MaterialTheme {
        Column {
            Row {
                Button(onClick = {
                    viewHelper.setCommand(DrawCircleCommand())
                }, modifier = Modifier.padding(10.dp)) {
                    Text("Circle")
                }
                Button(onClick = {
                    viewHelper.setCommand(DrawEllipseCommand())
                }, modifier = Modifier.padding(10.dp)) {
                    Text("Ellipse")
                }
                Button(onClick = {
                    viewHelper.setCommand(DrawSquareCommand())
                }, modifier = Modifier.padding(10.dp)) {
                    Text("Square")
                }
                Button(onClick = {
                    viewHelper.setCommand(DrawRectCommand())
                }, modifier = Modifier.padding(10.dp)) {
                    Text("Rect")
                }
                Button(onClick = {
                    viewHelper.setCommand(DrawTriangleCommand())
                }, modifier = Modifier.padding(10.dp)) {
                    Text("Triangle")
                }
            }
            Row {
                Canvas(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(color = Color.LightGray)
                    .pointerInput(Unit)
                     {
                        detectTapGestures {
                            viewHelper.executeCommand(it)
                        }
                    }) {

                    drawing.shapes.forEach {
                        it.draw(this)
                    }

                }
            }
        }

    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}