package com.example.bindingview

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.bindingview.databinding.ActivityMainBinding
import com.example.bindingview.databinding.FragmentMainBinding

class MainFragment:Fragment() {

    private lateinit var bind: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentMainBinding.inflate(layoutInflater)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bind.btnA.setOnClickListener {
            bind.tvHasil.text = "Tombol A"
        }

        bind.btnB.setOnClickListener {
            bind.tvHasil.text = "Tombol B"
        }
    }
}