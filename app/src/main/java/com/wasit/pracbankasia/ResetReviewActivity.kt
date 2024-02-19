package com.wasit.pracbankasia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wasit.pracbankasia.databinding.ActivityCardCreateSuccessBinding
import com.wasit.pracbankasia.databinding.ActivityResetReviewBinding

class ResetReviewActivity : AppCompatActivity() {
    lateinit var binding: ActivityResetReviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResetReviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            intent = Intent(this, CardInformationActivity::class.java)
            intent.putExtra("Source", "from_cpr")
            startActivity(intent)
//        binding.btnSubmit.setOnClickListener {
//            intent = Intent(this, CardInformationActivity::class.java)
//            startActivity(intent)
//        }


        }
    }
}