package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.LoginActivityLayoutBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding : LoginActivityLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginActivityLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}