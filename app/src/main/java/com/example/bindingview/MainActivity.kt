package com.example.bindingview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bindingview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // lama
        // setContentView(R.layout.activity_main)
        // val btnA = findViewById<Button>(R.id.btnA)
        // val btnB = findViewById<Button>(R.id.btnB)
        // val tvHasil = findViewById<TextView>(R.id.tvHasil)

        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btnA.setOnClickListener {
            bind.tvHasil.text = "Tombol A"
        }

        bind.btnB.setOnClickListener {
            bind.tvHasil.text = "Tombol B"
        }
    }
}