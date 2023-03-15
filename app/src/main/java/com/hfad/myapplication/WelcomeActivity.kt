package com.hfad.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val fullName = intent.getStringExtra(FULL_NAME_KEY)
        findViewById<TextView>(R.id.welcome_text).text = getString(R.string.welcome_text, fullName)
    }
}