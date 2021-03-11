package com.example.samplecompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {

    val welcomeMsg ="Welcome to the world of Compose"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                displayMessage(welcomeMsg)
        }
    }


    @Composable
    fun displayMessage(msg:String) {
        Text(text = "Message is :$msg!")
    }

    @Preview(showBackground = true, backgroundColor = 0xFF00FF00)
    @Composable
    fun previewDisplayMessage() {
            displayMessage(welcomeMsg)

    }
}