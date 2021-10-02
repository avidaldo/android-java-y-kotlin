package com.example.javaykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


/**
 * Creamos una nueva activity:
 * (File > New > Activity > Empty Activity) seleccionando esta vez "Kotlin" como lenguaje.
 */

class KotlinMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_main)

        val buttonMAK = findViewById<Button>(R.id.buttonMAK)

        buttonMAK.setOnClickListener {
            val intent = Intent(
                this@KotlinMainActivity,  // https://kotlinlang.org/docs/this-expressions.html#qualified
                JavaMainActivity::class.java
            )
            startActivity(intent)
        }

    }
}