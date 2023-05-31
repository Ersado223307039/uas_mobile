package com.example.octopus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    private lateinit var numberEditText: EditText
    private lateinit var numberrEditText: EditText
    private lateinit var calculateButton: Button
    private lateinit var resetButton: Button
    private lateinit var resultTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        numberEditText = findViewById(R.id.editTextNumberr)
        numberrEditText = findViewById(R.id.editTextNumberrr)
        calculateButton = findViewById(R.id.calculateButtonn)
        resetButton = findViewById(R.id.resetButtonn)
        resultTextView = findViewById(R.id.Hasill)

        calculateButton.setOnClickListener {
            calculatePercentage()
        }
        resetButton.setOnClickListener{
            resetInputs()
        }
    }

    private fun calculatePercentage() {
        val number = numberEditText.text.toString().toDouble()
        val numbertotal = numberrEditText.text.toString().toDouble()

        val result = (number * 100) / numbertotal
        resultTextView.text = "Hasil persentasenya: $result %"
    }

    private fun resetInputs() {
        numberEditText.text.clear()
        numberrEditText.text.clear()
    }
}
