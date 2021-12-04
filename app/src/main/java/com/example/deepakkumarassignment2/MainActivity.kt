package com.example.deepakkumarassignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    val countmap= mutableMapOf<String, Int>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<TextView>(R.id.t2)
        val c=findViewById<TextView>(R.id.t3)
findViewById<TextView>(R.id.gr).setOnClickListener {
val newscreen=Intent(this,Greeting::class.java)
    newscreen.putExtra("nameofuser",extraname())
    startActivity(newscreen)
}



        btn.setOnClickListener {

            val name=extraname()


         val oldcount=countmap[name] ?: 0
            val newcount=oldcount+1
            countmap[name]=newcount

            c.text = "$name clicked $newcount times"











        }




    }
    private  fun  extraname(): String
    {
        val n=findViewById<TextInputLayout>(R.id.textInputLayout)

        val username=n.editText?.text?.toString()

        return  if(username.isNullOrEmpty()) "Somebody"
            else username


    }
}


