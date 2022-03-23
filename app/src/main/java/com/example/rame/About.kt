package com.example.rame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class About : AppCompatActivity() {
    private lateinit var buttonn: Button
    private lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)
        buttonn = findViewById(R.id.buttonn)
        button = findViewById(R.id.button)
        pre()
    }

    private fun pre() {
        buttonn.setOnClickListener {
            startActivity(Intent(this, welcome::class.java))
            finish()

        }
        button.setOnClickListener {
            startActivity(Intent(this, data_form::class.java))
            finish()
        }
    }
}