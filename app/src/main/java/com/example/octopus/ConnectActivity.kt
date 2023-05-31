package com.example.octopus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConnectActivity : AppCompatActivity() {
    private lateinit var hitungButton : Button
    private lateinit var ubahButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connect)

        hitungButton = findViewById(R.id.hitungBtn)
        hitungButton.setOnClickListener{
            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }

        ubahButton = findViewById(R.id.ubahBtn)
        ubahButton.setOnClickListener{
            val intent2 = Intent(this, MainActivity2::class.java)
            startActivity(intent2)
        }
    }
}