package com.example.rame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class welcome : AppCompatActivity() {
    private lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        button2 = findViewById(R.id.button)
        click()
    }

    private fun click(){
        button2.setOnClickListener {
                startActivity(Intent(this, About::class.java))
                finish()

        }
    }
}