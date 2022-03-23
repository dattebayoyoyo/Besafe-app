package com.example.rame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class accessories : AppCompatActivity() {
    private lateinit var connect: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.accessories)
        connect= findViewById(R.id.connect)
        con()
    }
    private fun con(){
        connect.setOnClickListener {
            startActivity(Intent(this, finish::class.java))
            finish()
            Toast.makeText(this, "Success!", Toast.LENGTH_LONG).show()
        }
    }
}