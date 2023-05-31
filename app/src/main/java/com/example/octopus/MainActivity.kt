package com.example.octopus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var numberEditText: EditText
    private lateinit var percentageEditText: EditText
    private lateinit var calculateButton: Button
    private lateinit var resetButton: Button
    private lateinit var resultTextVieww: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberEditText = findViewById(R.id.editTextNumber)
        percentageEditText = findViewById(R.id.editTextPercentage)
        calculateButton = findViewById(R.id.calculateButton)
        resetButton = findViewById(R.id.resetButton)
        resultTextVieww = findViewById(R.id.Hasil)

        calculateButton.setOnClickListener {
            calculatePercentage()
        }
        resetButton.setOnClickListener{
            resetInputs()
        }
    }

    private fun calculatePercentage() {
        val number = numberEditText.text.toString().toDouble()
        val percentage = percentageEditText.text.toString().toDouble()

        val result = number * percentage / 100
        resultTextVieww.text = "Hasil : $result "

    }

    private fun resetInputs() {
        numberEditText.text.clear()
        percentageEditText.text.clear()
    }
}



