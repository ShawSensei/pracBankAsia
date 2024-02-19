package com.wasit.pracbankasia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wasit.pracbankasia.databinding.ActivityCardApplicationBinding

class CardApplicationActivity : AppCompatActivity() {

    lateinit var binding: ActivityCardApplicationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCardApplicationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.arrowBack.setOnClickListener {
            finish()

        }
//        binding.btnApp.setOnClickListener {
//            intent = Intent(this, CardCreateSuccessActivity::class.java)
//            startActivity(intent)
//        }
        binding.btnApp.setOnClickListener {
            intent = Intent(this, CardInformationActivity::class.java)
            intent.putExtra("Source", "from_vca")
            startActivity(intent)
        }


    }
}