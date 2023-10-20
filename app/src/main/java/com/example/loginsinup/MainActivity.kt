package com.example.loginsinup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginsinup.databinding.ActivityLoginBinding
import com.example.loginsinup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tomap.setOnClickListener{
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }
        binding.personal.setOnClickListener {
            val intent = Intent(this, Personal_info::class.java)
            startActivity(intent)
        }
    }
}