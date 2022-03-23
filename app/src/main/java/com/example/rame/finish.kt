package com.example.rame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class finish : AppCompatActivity() {
    private lateinit var button2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.finish)
        button2 = findViewById(R.id.button2)
        ss()
    }
    private fun ss(){
        button2.setOnClickListener {
            Toast.makeText(this, "Your data sent to all nearby\n police stations, fire departments\n and hospitals!!!", Toast.LENGTH_LONG).show()
        }
    }
}