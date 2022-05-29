package com.bangkit.capstone.c22_ps321.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangkit.capstone.c22_ps321.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            cvScan.setOnClickListener {
                startActivity(Intent(this@MainActivity, ScanActivity::class.java))
            }

            cvMenu3.setOnClickListener {
                startActivity(Intent(this@MainActivity, ResultActivity::class.java))
            }
        }
    }
}