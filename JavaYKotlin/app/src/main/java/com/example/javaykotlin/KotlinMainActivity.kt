package com.example.javaykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


/**
 * Creamos una nueva activity:
 * (File > New > Activity > Empty Activity) seleccionando esta vez "Kotlin" como lenguaje.
 */

class KotlinMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_main)
    }
}