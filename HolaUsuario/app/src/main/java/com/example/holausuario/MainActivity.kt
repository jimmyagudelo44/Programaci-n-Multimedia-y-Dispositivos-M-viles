package com.example.holausuario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var tText: TextInputEditText
    private lateinit var tButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tText = findViewById<TextInputEditText>(R.id.tText)
        tButton = findViewById<Button>(R.id.tButton)

        tButton.setOnClickListener {

            val intent = Intent(this@MainActivity, NameDisplayer::class.java)
            intent.putExtra("NAME", tText.text.toString())
            startActivity(intent)
        }

    }
}