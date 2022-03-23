package com.example.rame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class data_form : AppCompatActivity() {
    private lateinit var butonn: Button
    private lateinit var button: Button
    private lateinit var Name: EditText
    private lateinit var LastName: EditText
    private lateinit var BirthDate: EditText
    private lateinit var FirstCheck: CheckBox
    private lateinit var SecondCheck: CheckBox
    private lateinit var ThirdCheck: CheckBox
    private lateinit var FourCheck: CheckBox
    private lateinit var PlusCheck: CheckBox
    private lateinit var MinusCheck: CheckBox
    private lateinit var Piradi: EditText
    private lateinit var Phone: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.data_form)
        butonn = findViewById(R.id.buttonn)
        button = findViewById(R.id.button)
        Name = findViewById(R.id.Name)
        LastName = findViewById(R.id.LastName)
        BirthDate = findViewById(R.id.BirthDate)
        FirstCheck = findViewById(R.id.FirstCheck)
        SecondCheck = findViewById(R.id.SecondCheck)
        ThirdCheck = findViewById(R.id.ThirdCheck)
        FourCheck = findViewById(R.id.FourCheck)
        PlusCheck = findViewById(R.id.PlusCheck)
        MinusCheck = findViewById(R.id.MinusCheck)
        Piradi = findViewById(R.id.Piradi)
        Phone = findViewById(R.id.Phone)
        pre()
    }
    private fun pre(){
        butonn.setOnClickListener {
            startActivity(Intent(this, About::class.java))
            finish()

        }
        button.setOnClickListener {
            if (Name.text.isEmpty() || LastName.text.isEmpty() || BirthDate.text.isEmpty() || Phone.text.isEmpty() || Piradi.text.isEmpty() || Piradi.text.length != 11 || Phone.text.length <9 || Phone.text.length > 12    || BirthDate.text.length != 8) {
                Toast.makeText(this, "Error!!!", Toast.LENGTH_SHORT).show()
            } else
                if (Name.text.isNotEmpty() && LastName.text.isNotEmpty() && BirthDate.text.isNotEmpty() && BirthDate.text.length == 8 && FirstCheck.isChecked || SecondCheck.isChecked || ThirdCheck.isChecked && PlusCheck.isChecked || MinusCheck.isChecked || FourCheck.isChecked &&Phone.text.isNotEmpty() && Phone.text.length < 12 && Piradi.text.isNotEmpty() && Piradi.text.length == 11) {
                    startActivity(Intent(this, data_form2::class.java))
                    finish()
                }
        }

    }
}