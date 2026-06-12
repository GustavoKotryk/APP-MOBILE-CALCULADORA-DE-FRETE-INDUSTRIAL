package com.example.calculadorafrete

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextRegiao = findViewById<EditText>(R.id.editTextRegiao)
        val editTextValor = findViewById<EditText>(R.id.editTextValor)
        val buttonCalcular = findViewById<Button>(R.id.buttonCalcular)
        val textViewPercentual = findViewById<TextView>(R.id.textViewPercentual)
        val textViewFrete = findViewById<TextView>(R.id.textViewFrete)
        val textViewTotal = findViewById<TextView>(R.id.textViewTotal)
    }
}