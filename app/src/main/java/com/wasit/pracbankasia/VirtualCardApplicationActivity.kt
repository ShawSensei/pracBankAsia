package com.wasit.pracbankasia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.wasit.pracbankasia.databinding.ActivityCardCreateSuccessBinding
import com.wasit.pracbankasia.databinding.ActivityVirtualCardApplicationBinding

class VirtualCardApplicationActivity : AppCompatActivity() {
    lateinit var binding: ActivityVirtualCardApplicationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityVirtualCardApplicationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = arrayOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, items)
        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.dropdownPcard)
        autoCompleteTextView.setAdapter(adapter)

        val cards = arrayOf("Credit Card", "Debit Card", "Master Card")
        val adaptCards = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, cards)
        val autoCompleteCards = findViewById<AutoCompleteTextView>(R.id.dropdownCtype)
        autoCompleteCards.setAdapter(adaptCards)

        val products = arrayOf("Product 1", "Product 2", "Product 3")
        val adaptProducts = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, products)
        val autoCompleteProducts = findViewById<AutoCompleteTextView>(R.id.dropdownPtype)
        autoCompleteProducts.setAdapter(adaptProducts)

        binding.btnApply.setOnClickListener {
            intent = Intent(this, CardApplicationActivity::class.java)
            startActivity(intent)
        }
    }
}