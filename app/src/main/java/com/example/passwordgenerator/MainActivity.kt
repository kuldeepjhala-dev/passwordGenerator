package com.example.passwordgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passwordgenerator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val passwordGenerator = PasswordGenerator()

        binding.buttonGenerate.setOnClickListener {
            val password:String = passwordGenerator.generatePassword(12,"coffee")
            binding.textviewOutput.text = password
        }


    }
}