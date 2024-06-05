package org.multicalculator.project

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}
@Composable
fun CalcView(){

}
@Composable
fun CalcRow(){

}
@Composable
fun CalcDisplay(){

}
@Composable
fun CalcNumericButton(){

}
@Composable
fun CalcOperationButton(){

}
/*@Composable
fun CalcEqualsButton(display:){

}*/
