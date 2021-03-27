package com.aysegul.calismayapisiodev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_sayfa_b.*

class SayfaB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_b)

        button4.setOnClickListener {
            val intent = Intent(this@SayfaB, SayfaY::class.java)
            startActivity(intent)
            finish()
        }
    }
}