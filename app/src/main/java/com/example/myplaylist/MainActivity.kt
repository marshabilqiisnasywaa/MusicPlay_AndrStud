package com.example.myplaylist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enable edge-to-edge content if desired
        enableEdgeToEdge()
    }

    private fun enableEdgeToEdge() {
        // Apply edge-to-edge display mode if supported
        ViewCompat.setOnApplyWindowInsetsListener(window.decorView) { view, insets ->
            val systemBarsInsets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(0, 0, 0, systemBarsInsets.bottom)
            insets
        }
    }
}
