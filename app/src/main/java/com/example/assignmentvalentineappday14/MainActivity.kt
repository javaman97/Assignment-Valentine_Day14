package com.example.assignmentvalentineappday14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cardViewHistory:CardView=findViewById(R.id.cardview_history)
        val cardViewMessage:CardView=findViewById(R.id.cardview_message)
        cardViewHistory.setOnClickListener {
            val intent=Intent(this,First_Card::class.java)
            startActivity(intent)
        }
        cardViewMessage.setOnClickListener {
            val intent=Intent(this,CoderLife::class.java)
            startActivity(intent)
        }
    }
}