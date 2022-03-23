package com.example.rame

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class data_form2 : AppCompatActivity() {
    private lateinit var butonn: Button
    private lateinit var button:Button
    private lateinit var Piradi: EditText
    private lateinit var Address: EditText
    private lateinit var Email: EditText
    private lateinit var Name: EditText
    private lateinit var BirthDate: EditText
    private lateinit var Phone: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.data_form2)

        button = findViewById(R.id.button)
        butonn = findViewById(R.id.buttonn)
        Name = findViewById(R.id.Name)
        BirthDate = findViewById(R.id.BirthDate)
        Piradi = findViewById(R.id.Piradi)
        Address = findViewById(R.id.Address)
        Email = findViewById((R.id.Email))
        Phone = findViewById(R.id.Phone)

        pre()
    }
    private fun pre(){
        butonn.setOnClickListener {
            startActivity(Intent(this, data_form::class.java))
            finish()

        }
    button.setOnClickListener {
        if (Address.text.isEmpty() || Email.text.isEmpty() || Name.text.isEmpty() || BirthDate.text.isEmpty() || Piradi.text.isEmpty() || Piradi.text.length != 11 || Phone.text.isEmpty() || Phone.text.length < 9 || Phone.text.length > 12) {
            Toast.makeText(this, "Error!!!", Toast.LENGTH_SHORT).show()
        } else
            if (Address.text.isNotEmpty() && Email.text.isNotEmpty() && Name.text.isNotEmpty() && BirthDate.text.isNotEmpty() && BirthDate.text.length == 8 && Piradi.text.isNotEmpty() && Piradi.text.length == 11 && Phone.text.isNotEmpty() && Phone.text.length == 9 || Phone.text.length == 12 ) {

                val dialogueBuilder = AlertDialog.Builder(this)
                    .setTitle("Location")
                    .setMessage("ALLOW YOUR LOCATION?")
                    .setPositiveButton("YES",) { dialog, i ->
                        startActivity(Intent(this, accessories::class.java))
                        finish()
                        dialog.dismiss()
                    }
                    .setNegativeButton("NO") { dialog, i ->
                        dialog.dismiss()
                    }
                    .setNeutralButton("CANCEL") { dialog, i ->
                        dialog.dismiss()
                    }.setCancelable(false)
                val alert = dialogueBuilder.create()
                alert.show()
            }
        }
    }
}