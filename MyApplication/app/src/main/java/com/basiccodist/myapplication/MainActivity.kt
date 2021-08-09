package com.basiccodist.myapplication

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//Coroutine Tutorial by BasicCodist

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickBtn:Button = findViewById(R.id.button)
        clickBtn.setOnClickListener{
            CoroutineScope(Dispatchers.Default).launch {
                NewTask()
            }
        }
    }

    private suspend fun NewTask()
    {
        val txtView:TextView = findViewById(R.id.textView)
        txtView.text = "Hello!!"
    }
}
