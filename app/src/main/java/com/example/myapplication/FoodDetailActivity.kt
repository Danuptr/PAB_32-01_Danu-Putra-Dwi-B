package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FoodDetailActivity : AppCompatActivity() {
    private var quantity = 1
    private val basePrice = 28000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        val btnPlus = findViewById<Button>(R.id.btnPlus)
        val tvQuantity = findViewById<TextView>(R.id.tvQuantity)
        val btnAddToCart = findViewById<Button>(R.id.btnAddToCart)

        btnBack.setOnClickListener {
            finish()
        }

        btnMinus.setOnClickListener {
            if (quantity > 1) {
                quantity--
                tvQuantity.text = quantity.toString()
                updatePriceButton(btnAddToCart)
            }
        }

        btnPlus.setOnClickListener {
            quantity++
            tvQuantity.text = quantity.toString()
            updatePriceButton(btnAddToCart)
        }

        btnAddToCart.setOnClickListener {
            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)
        }
    }

    private fun updatePriceButton(btn: Button) {
        val total = basePrice * quantity
        btn.text = "Tambah ke Keranjang • Rp %,d".format(total).replace(',', '.')
    }
}
