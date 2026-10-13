package com.example.pmm_12

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class layout_practica : AppCompatActivity() {

    private lateinit var visible: TextView
    private lateinit var gone: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_layout_practica)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        visible = findViewById<TextView>(R.id.Tvisible)
        gone = findViewById<TextView>(R.id.gone)

        visible.setOnClickListener {
            gone.visibility = View.VISIBLE
        }

    }
}