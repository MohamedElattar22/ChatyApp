package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.SignupActivityLayoutBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var binding : SignupActivityLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SignupActivityLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}