package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        val btnDetailProject1 = findViewById<Button>(R.id.btnDetailProject1)
        val btnDetailProject2 = findViewById<Button>(R.id.btnDetailProject2)
        val btnBackToHome = findViewById<Button>(R.id.btnBackToHome)

        // Klik Proyek 1
        btnDetailProject1.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("PROJECT_TITLE", "E-Layanan Permohonan Akademik")
                putExtra("PROJECT_CATEGORY", "Web Service Application")
                putExtra("PROJECT_DESC", "Sistem pengajuan permohonan akademik berbasis web untuk efisiensi pelayanan publik dan tata kelola data mahasiswa.")
                putExtra("PROJECT_STACK", "CodeIgniter 4, PHP, Bootstrap, MySQL")
            }
            startActivity(intent)
        }

        // Klik Proyek 2
        btnDetailProject2.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("PROJECT_TITLE", "MariLancy Freelance Portal")
                putExtra("PROJECT_CATEGORY", "Fullstack Web App")
                putExtra("PROJECT_DESC", "Portal pencarian kerja freelance entry-level yang mencakup manajemen klien, pendaftaran pelamar, dan sistem notifikasi.")
                putExtra("PROJECT_STACK", "Vue.js, Vite, Golang, PostgreSQL")
            }
            startActivity(intent)
        }

        // Kembali ke Dashboard
        btnBackToHome.setOnClickListener {
            finish()
        }
    }
}