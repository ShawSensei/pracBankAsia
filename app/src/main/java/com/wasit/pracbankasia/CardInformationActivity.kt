package com.wasit.pracbankasia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.wasit.pracbankasia.databinding.ActivityCardInformationBinding
import com.wasit.pracbankasia.databinding.ActivityResetReviewBinding

class CardInformationActivity : AppCompatActivity() {
    lateinit var binding: ActivityCardInformationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCardInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.btnVisibility.setOnClickListener {
//            intent = Intent(this, ResetSuccessfulActivity::class.java)
//            startActivity(intent)
//
//
//        }
        val text = "Hide Info"
        val text2 = "Show Hidden Info"
        val text3 = "7574-7363-1362-5462"
        var isHidden = true

        val sensitiveInfo = "7574-7363-1362-5462"

// Replace characters after the third and seventh hyphens with asterisks
        val encryptedInfo = sensitiveInfo.mapIndexed { index, char ->
            when {
                (index in 5..6 || index in 10..13) && char != '-' -> '*' // Replace characters between the second and fifth hyphens
                else -> char // Keep hyphens and other characters unchanged
            }
        }.joinToString("")


        binding.btnVisibility.setOnClickListener {

                isHidden = !isHidden

                binding.btnVisibility.text = if(isHidden) text else text2


                val drawableRes = if (isHidden) R.drawable.hidden_eye else R.drawable.show_eye
                binding.btnVisibility.setCompoundDrawablesWithIntrinsicBounds(drawableRes, 0, 0, 0)


                binding.hideCard.text = if(isHidden) text3 else encryptedInfo
                binding.hideValid.text = if(isHidden) "12/26" else "**/**"
                binding.hideCVV.text = if(isHidden) "695" else "***"
        }


        val destinationIntent = when (intent.getStringExtra("Source")) {
            "from_vca" -> Intent(this, CardCreateSuccessActivity::class.java)
            "from_cpr" -> Intent(this, ResetSuccessfulActivity::class.java)
            else -> Intent(this, MainActivity::class.java) // Handle default case if needed
        }

        binding.btnActivate.setOnClickListener {
            startActivity(destinationIntent)
        }


    }
}