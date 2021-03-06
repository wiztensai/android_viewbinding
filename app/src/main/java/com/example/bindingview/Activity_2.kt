package com.example.bindingview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bindingview.databinding.Activity2Binding

class Activity_2 : AppCompatActivity() {

    private lateinit var bind: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = Activity2Binding.inflate(layoutInflater)
        setContentView(bind.root)

        supportFragmentManager.beginTransaction().replace(R.id.container,MainFragment()).commit()
    }
}