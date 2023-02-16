package com.example.assignmentvalentineappday14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sorry_SingleLife : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorry_single_life)

       val btnFamily: Button =findViewById(R.id.button_family)
        val btnSelfLove: Button =findViewById(R.id.button_selflove)
        btnFamily.setOnClickListener{
            val intent= Intent(this,Second_Card::class.java)
            startActivity(intent)
        }
        btnSelfLove.setOnClickListener{
            val intent= Intent(this,CoderLife::class.java)
            startActivity(intent)
        }
    }
}