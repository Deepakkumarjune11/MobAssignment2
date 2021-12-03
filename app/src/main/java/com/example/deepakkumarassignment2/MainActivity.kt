package com.example.deepakkumarassignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    var countmap= mutableMapOf<String, Int>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val n=findViewById<TextInputLayout>(R.id.textInputLayout)
        val btn=findViewById<TextView>(R.id.t2)
        val c=findViewById<TextView>(R.id.t3)

        btn.setOnClickListener {

            val username=n.editText?.text?.toString()
            val name=
                if(username.isNullOrEmpty()) "Somebody"
            else username

         val oldcount=countmap[name] ?: 0
            val newcount=oldcount+1
            countmap[name]=newcount

            c.text = "$name clicked $newcount times"











        }




    }
}


