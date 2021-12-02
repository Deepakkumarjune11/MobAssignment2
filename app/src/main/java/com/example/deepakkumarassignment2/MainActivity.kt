package com.example.deepakkumarassignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    var count=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


val n=findViewById<TextInputLayout>(R.id.textInputLayout)
        val btn=findViewById<TextView>(R.id.t2)
        val c=findViewById<TextView>(R.id.t3)
        val nameMap= mutableMapOf<String,Int>()

        btn.setOnClickListener {

            val username=n.editText?.text?.toString()

                if(username.isNullOrEmpty()) "Somebody"
            else username

            if(username in nameMap)
            {
                count= nameMap[username.toString()]!!
                nameMap[username.toString()]=count+1
            }
            else
            {
                nameMap.put(username.toString(),+1)
            }
            c.text = "$username clicked ${nameMap[username]} times"











        }




    }
}