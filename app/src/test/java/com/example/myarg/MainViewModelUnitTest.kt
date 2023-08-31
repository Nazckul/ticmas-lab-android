package com.example.myarg

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*

@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
class MainActivityUnitTest {

    private lateinit var activity: MainActivity
    private lateinit var txtUno: EditText
    private lateinit var txtDos: EditText
    private lateinit var compareButton: Button
    private lateinit var resultTextView: TextView

    @Before
    fun setup() {
        activity = MainActivity()
        activity.setContentView(R.layout.activity_main)

        txtUno = activity.findViewById(R.id.txtUno)
        txtDos = activity.findViewById(R.id.txtDos)
        compareButton = activity.findViewById(R.id.button3)
        resultTextView = activity.findViewById(R.id.textView3)
    }

    @Test
    fun testButtonClicked_textEquals() {
        txtUno.setText("Hello")
        txtDos.setText("Hello")

        compareButton.performClick()

        assertEquals("Resultado: Los textos son iguales.", resultTextView.text.toString())
    }

    @Test
    fun testButtonClicked_textNotEquals() {
        txtUno.setText("Hello")
        txtDos.setText("World")

        compareButton.performClick()

        assertEquals("Resultado: Los textos son diferentes.", resultTextView.text.toString())
    }
}
