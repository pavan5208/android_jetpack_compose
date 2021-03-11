package com.example.samplecompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class UIHierachyActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewStory()
        }
    }

    @Composable
    fun NewStory(){
        Column (modifier = Modifier.padding(16.dp)){
            Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = null)
            Text("How are you")
            Text("What's going on")
            Text("Let's rock")
        }
    }
}