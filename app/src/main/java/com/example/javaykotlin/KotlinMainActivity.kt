package com.example.javaykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class KotlinMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_main)

        val buttonKotlin = findViewById<Button>(R.id.buttonKotlin)

        buttonKotlin.setOnClickListener {
            val intent = Intent(this,JavaMainActivity::class.java)
            startActivity(intent)
        }

    }
}