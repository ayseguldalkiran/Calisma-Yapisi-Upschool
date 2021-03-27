package com.aysegul.calismayapisiodev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sayfa_x.*

class SayfaX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_x)

        button5.setOnClickListener {
            val intent = Intent(this@SayfaX, SayfaY::class.java)
            startActivity(intent)
            finish()
        }
    }
}