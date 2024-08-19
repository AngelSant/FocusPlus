package com.example.focusplus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.focusplus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configuración de ViewBinding para vincular el XML con Kotlin
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Lógica para la pantalla principal
        binding.greetingText.text = "Hello Android!"
    }
}