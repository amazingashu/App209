package com.acrony.app209

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val nextbutton=findViewById<Button>(R.id.btnNext)
        val tvusername=findViewById<TextView>(R.id.tvName)
        val tvAddress=findViewById<TextView>(R.id.tvAddress)
        val tvPhone=findViewById<TextView>(R.id.tvPhone)

        val uname:String=intent.getStringExtra("Name")
        val age:String=intent.getStringExtra("Age")
        val phone:String=intent.getStringExtra("Phone")
        val adrress:String=intent.getStringExtra("Address")

        tvusername.setText(uname)
        tvAddress.setText(adrress)
       tvPhone.setText(phone)

        nextbutton.setOnClickListener {

            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
