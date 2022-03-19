package com.example.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Button(text : String, onClick: () -> Unit) {

    androidx.compose.material.Button(
        onClick = onClick,
    ){
        Text(text = text)
    }

}
