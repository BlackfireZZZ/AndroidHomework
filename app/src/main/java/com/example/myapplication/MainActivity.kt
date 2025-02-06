package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val qrImageUrl = "https://raw.githubusercontent.com/username/repository/main/qr_code.png"
        binding.qrImageView.load(qrImageUrl) {
            placeholder(R.drawable.placeholder)
            error(R.drawable.placeholder)
        }
    }
}
