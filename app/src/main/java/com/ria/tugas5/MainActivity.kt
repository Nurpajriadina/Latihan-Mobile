package com.ria.tugas5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnLatihan2 : Button
    private lateinit var btnLatihan4 : Button
    private lateinit var btnKalkulatorSederhana: Button
    private lateinit var btnPassingData: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnLatihan2 = findViewById(R.id.btnLatihan2)
        btnLatihan4 = findViewById(R.id.btnLatihan4)
        btnKalkulatorSederhana = findViewById(R.id.btnKalkulatorSederhana)
        btnPassingData = findViewById(R.id.btnPassingData)

        // untuk 1 screen terdiri dari 1 main activity dan 1 file xml layout
        // untuk widget yang dipakai, harus dideklarasi dahulu
        // kita deklarasi findviewby id

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLatihan2.setOnClickListener(){
            val intentMenu = Intent(this@MainActivity, Latihan2Activity::class.java)
            startActivity(intentMenu)
        }

        btnLatihan4.setOnClickListener(){
            val intentMenu = Intent(this@MainActivity, Latihan4Activity::class.java)
            startActivity(intentMenu)
        }

        btnKalkulatorSederhana.setOnClickListener() {
            val intentMenu = Intent(this@MainActivity, KalkulatorSederhanaActivity::class.java)
            startActivity(intentMenu)
        }

        btnPassingData.setOnClickListener() {
            val intentMenu = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intentMenu)
        }
    }
}