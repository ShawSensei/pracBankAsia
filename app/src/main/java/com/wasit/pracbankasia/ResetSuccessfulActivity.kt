package com.wasit.pracbankasia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wasit.pracbankasia.databinding.ActivityCardCreateSuccessBinding
import com.wasit.pracbankasia.databinding.ActivityResetSuccessfulBinding

class ResetSuccessfulActivity : AppCompatActivity() {
    lateinit var binding: ActivityResetSuccessfulBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResetSuccessfulBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHome.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            finishAffinity()
        }
    }
}