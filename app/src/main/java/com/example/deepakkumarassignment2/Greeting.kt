package com.example.deepakkumarassignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Greeting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
        val uname=intent.getStringExtra("nameofuser")
        findViewById<TextView>(R.id.gre1).text="Hello $uname"
    }
}