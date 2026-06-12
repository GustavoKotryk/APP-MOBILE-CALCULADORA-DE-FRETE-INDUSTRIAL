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

        buttonCalcular.setOnClickListener {
            val regiao = editTextRegiao.text.toString()
            val valor = editTextValor.text.toString().toFloat()

            val percentual = when (regiao.uppercase()){
                "SUL" -> 0.05f
                "SUDESTE" -> 0.07f
                "CENTRO-OESTE" -> 0.08f
                "NORDESTE" -> 0.10f
                "NORTE" -> 0.12f
                else -> 0.0f
            }

            val valorFrete = valor * percentual
            val valorTotal = valor + valorFrete

            textViewPercentual.text="Percentual: ${(percentual * 100).toInt()}%"
            textViewFrete.text = "Valor do frete: R$ %.2f".format(valorFrete)
            textViewTotal.text = "Valor total: R$ %.2f".format(valorTotal)

        }
    }
}