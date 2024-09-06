package com.ria.tugas5

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Latihan4Activity : AppCompatActivity() {

    private lateinit var forgotPassword : TextView
    private lateinit var signUp : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_latihan4)

        forgotPassword = findViewById(R.id.forgotPassword)
        signUp = findViewById(R.id.signUp)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        forgotPassword.setOnClickListener() {
            var intent = Intent(this@Latihan4Activity, forgotPassword::class.java)
            startActivity(intent)
        }

        signUp.setOnClickListener() {
            var intent2 = Intent(this@Latihan4Activity, signUp::class.java)
            startActivity(intent2)
        }
    }
}