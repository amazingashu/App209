package com.acrony.app209

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nextbutton=findViewById<Button>(R.id.btnNext)
        val etName=findViewById<EditText>(R.id.etName)

        nextbutton.setOnClickListener {

            intent= Intent(this,Activity2::class.java)

            val username=etName.text.toString()
            intent.putExtra("Name",username)
            intent.putExtra("Age","30")
            intent.putExtra("Phone","987654321")
            intent.putExtra("Address","Hyderbad")

            startActivity(intent)
        }


    }
}
