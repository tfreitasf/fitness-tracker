package br.com.povengenharia.fitnesstracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    private lateinit var btnImc:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnImc = findViewById(R.id.btn_bmi)

        btnImc.setOnClickListener{
            val i = Intent(this, BmiActivity::class.java)
            startActivity(i)

        }

    }
}