package com.siddhesh.letschat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        handler= Handler()
        handler.postDelayed({
            val intent= Intent(this,LogIn::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}