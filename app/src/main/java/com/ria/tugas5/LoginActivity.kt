package com.ria.tugas5

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    private lateinit var etUsername : EditText
    private lateinit var etPassword : EditText
    private lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        //passing --> pengriman data atau value dari satu activity ke activity  lain
        //intent
        //put extras --> untuk simpan dan kirim variabel
        //get extras --> untuk mengambil nilai yang sudah dikirim
        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener(){

            var intent = Intent(this@LoginActivity, WelcomePageActivity::class.java )
            // untuk mendapatkan nilai atay value dari edit text, kemudian kita rubah ke dalam bentuk string
            val nUsername = etUsername.text.toString()
            val nPassword = etPassword.text.toString()
            intent.putExtra("username", nUsername)
            intent.putExtra("password", nPassword)
            //cek data sudah dikirim
            Log.d("username nya : ", nUsername)
            Log.d("password nya : ", nPassword)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}