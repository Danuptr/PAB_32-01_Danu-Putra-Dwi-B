package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvCategory = findViewById<TextView>(R.id.tvDetailCategory)
        val tvTitle = findViewById<TextView>(R.id.tvDetailTitle)
        val tvDesc = findViewById<TextView>(R.id.tvDetailDesc)
        val tvStack = findViewById<TextView>(R.id.tvDetailStack)
        val btnBack = findViewById<Button>(R.id.btnBackToProjects)

        // Menerima data Intent dari ProjectActivity
        val title = intent.getStringExtra("PROJECT_TITLE") ?: "Detail Proyek"
        val category = intent.getStringExtra("PROJECT_CATEGORY") ?: "Umum"
        val desc = intent.getStringExtra("PROJECT_DESC") ?: "Tidak ada deskripsi."
        val stack = intent.getStringExtra("PROJECT_STACK") ?: "-"

        // Menampilkan data ke TextView
        tvTitle.text = title
        tvCategory.text = category
        tvDesc.text = desc
        tvStack.text = stack

        btnBack.setOnClickListener {
            finish()
        }
    }
}