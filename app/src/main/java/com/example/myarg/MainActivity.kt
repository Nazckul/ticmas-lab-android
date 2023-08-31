package com.example.myarg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var txtUno: EditText
    private lateinit var txtDos: EditText
    private lateinit var compareButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtUno = findViewById(R.id.txtUno)
        txtDos = findViewById(R.id.txtDos)
        compareButton = findViewById(R.id.button3)
        resultTextView = findViewById(R.id.textView3)

        compareButton.setOnClickListener {
            val text1 = txtUno.text.toString()
            val text2 = txtDos.text.toString()

            if (text1 == text2) {
                resultTextView.text = "Resultado: Los textos son iguales."
            } else {
                resultTextView.text = "Resultado: Los textos son diferentes."
            }
        }
    }
}