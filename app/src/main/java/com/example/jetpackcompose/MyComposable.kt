package com.example.jetpackcompose


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


@Composable
fun MyText(text:String, color: Color, size:Int){
    Text(text = text,color=color, fontSize = size)
}