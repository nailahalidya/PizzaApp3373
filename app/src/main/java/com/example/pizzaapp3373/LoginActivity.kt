package com.example.pizzaapp3373

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Ambil button LOGIN (ID hanya milik Button, bukan root layout)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            // Pindah ke HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            var user = txtUsername.text.toString().trim()
            var pwd = txtPassword.text.toString.trim()

            // Supaya tidak bisa kembali ke login
            finish()
        }
    }
}
