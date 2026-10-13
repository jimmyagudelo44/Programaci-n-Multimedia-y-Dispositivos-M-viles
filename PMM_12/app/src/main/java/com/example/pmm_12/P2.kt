package com.example.pmm_12

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class P2 : AppCompatActivity() {

    private lateinit var gon: ImageView

    private lateinit var next: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_p2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        next = findViewById<Button>(R.id.next)
        gon = findViewById<ImageView>(R.id.gon)
        next.setOnClickListener {
//            if(gon.visibility == View.VISIBLE)
//                gon.visibility = View.GONE
//            else
//                gon.visibility = View.VISIBLE
            gon.visibility = View.VISIBLE
        }

    }
}