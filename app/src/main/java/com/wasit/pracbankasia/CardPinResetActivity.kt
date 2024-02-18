package com.wasit.pracbankasia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.core.content.ContentProviderCompat.requireContext
import com.wasit.pracbankasia.databinding.ActivityCardPinResetBinding

class CardPinResetActivity : AppCompatActivity() {
    lateinit var binding: ActivityCardPinResetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityCardPinResetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = arrayOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, items)
        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.dropdownAccount)
        autoCompleteTextView.setAdapter(adapter)

        val status = arrayOf("OPEN","DISABLED","CLOSED","ACTIVE")
        val adaptSTATUS = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, status)
        val autoCompleteSTATUS = findViewById<AutoCompleteTextView>(R.id.dropdownStatus)
        autoCompleteSTATUS.setAdapter(adaptSTATUS)


        binding.btnProceed.setOnClickListener {
            intent = Intent(this, CardCreateSuccessActivity::class.java)
            startActivity(intent)
        }
    }
}