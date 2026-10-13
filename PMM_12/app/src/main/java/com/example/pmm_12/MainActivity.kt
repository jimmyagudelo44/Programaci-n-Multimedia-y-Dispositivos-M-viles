package com.example.pmm_12

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var plusB: Button
    private lateinit var p2: Button
    private lateinit var p3: Button
    private lateinit var totalB: Button
    private lateinit var n1t: TextInputEditText
    private lateinit var n2t: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        plusB = findViewById<Button>(R.id.plusB)
        n1t = findViewById<TextInputEditText>(R.id.n1t)
        n2t = findViewById<TextInputEditText>(R.id.n2t)
        p2 = findViewById<Button>(R.id.P2)
        p3 = findViewById<Button>(R.id.P3)
        totalB = findViewById<Button>(R.id.total)
        p2.setOnClickListener {
            val intent = Intent(this@MainActivity, layout_practica::class.java)
            startActivity(intent)
        }

        plusB.setOnClickListener {

            var result: Int = 0
            var exit: Boolean

            do {
                try {
                    result = Integer.parseInt(n1t.text.toString()) + Integer.parseInt(n2t.text.toString())
                    exit = true
                } catch (ex: NumberFormatException) {
                    exit = false
                }
            }while(!exit)

            val intent = Intent(this@MainActivity, Display::class.java)
            intent.putExtra("n", result)
            startActivity(intent)
        }

        p3.setOnClickListener {
            val intent = Intent(this@MainActivity, P2::class.java)
            startActivity(intent)
        }

        totalB.setOnClickListener {
            val intent = Intent(this@MainActivity, P4::class.java)
            startActivity(intent)
        }

    }
}