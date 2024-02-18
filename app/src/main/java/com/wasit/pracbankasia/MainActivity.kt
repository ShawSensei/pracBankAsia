package com.wasit.pracbankasia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wasit.pracbankasia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetStarted.setOnClickListener {
            intent = Intent(this, VirtualCardApplicationActivity::class.java)
            startActivity(intent)

        }
        binding.btnReset.setOnClickListener {
            intent = Intent(this, CardPinResetActivity::class.java)
            startActivity(intent)

        }

    }
}