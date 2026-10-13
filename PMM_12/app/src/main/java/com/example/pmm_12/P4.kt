package com.example.pmm_12

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class P4 : AppCompatActivity() {

    private lateinit var minusB: ImageButton
    private lateinit var plusB: ImageButton

    private lateinit var nD: TextView
    private lateinit var totalD: TextView

    private var n: Int = 0
    private var total: String = "Total: "
    private var eur: String = "€"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_p4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        minusB = findViewById<ImageButton>(R.id.minusB)
        plusB = findViewById<ImageButton>(R.id.plusB)
        nD = findViewById<TextView>(R.id.nD)
        totalD = findViewById<TextView>(R.id.totalD)
        nD.text = 0.toString()

        minusB.setOnClickListener {
            if(n > 0)
                n--;
            nD.text = n.toString()
            total = "Total: "+(n*3)+eur
            totalD.text = total
        }
        plusB.setOnClickListener {
            n++;
            nD.text = n.toString()
            total = "Total: "+(n*3)+eur
            totalD.text = total
        }
    }
}