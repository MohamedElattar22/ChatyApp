package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.OnboardingLayoutBinding

class OnboardingActivity : AppCompatActivity() {
    private lateinit var binding : OnboardingLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = OnboardingLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.sign.setOnClickListener {
            startRegister()
        }
        binding.alreadyHaveAccTV.setOnClickListener {
            startLogin()
        }

    }
    private fun startRegister(){
        val intent = Intent(this , RegisterActivity::class.java)
        startActivity(intent)
    }
    private fun startLogin(){
        val intent = Intent(this , LoginActivity::class.java)
        startActivity(intent)

    }
}