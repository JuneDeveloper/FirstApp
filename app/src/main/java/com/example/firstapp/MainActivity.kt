package com.example.firstapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var editTextET:EditText
    private lateinit var textViewTV:TextView
    private lateinit var buttonBTN:Button
    private lateinit var textViewSum:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextET = findViewById(R.id.editTextET)
        textViewTV = findViewById(R.id.twoText)
        buttonBTN = findViewById(R.id.buttonOne)
        textViewSum = findViewById(R.id.textSum)

        onButtonClick(buttonBTN)

    }
    @SuppressLint("SetTextI18n")
    fun onButtonClick(view: View) {
        textViewTV.text = editTextET.text.reversed()
        var y = 0
        for(x in editTextET.text) if (x != ' ') y++
        textViewSum.text = y.toString()

    }
}