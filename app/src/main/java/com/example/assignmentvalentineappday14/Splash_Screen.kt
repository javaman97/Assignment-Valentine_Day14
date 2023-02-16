package com.example.assignmentvalentineappday14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.cardview.widget.CardView

class Splash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()
        val backgroundImage: ImageView =findViewById(R.id.splashScreenImage)
        val zoomAnimation= AnimationUtils.loadAnimation(this,R.anim.animation_splash_screen)
        backgroundImage.startAnimation(zoomAnimation)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}