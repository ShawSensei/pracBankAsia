package com.wasit.pracbankasia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wasit.pracbankasia.databinding.ActivityCardApplicationBinding
import com.wasit.pracbankasia.databinding.ActivityCardCreateSuccessBinding

class CardCreateSuccessActivity : AppCompatActivity() {
    lateinit var binding: ActivityCardCreateSuccessBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCardCreateSuccessBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHome.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            finishAffinity()
        }
    }
}