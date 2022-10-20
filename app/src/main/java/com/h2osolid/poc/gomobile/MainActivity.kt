package com.h2osolid.poc.gomobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import foo.Foo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textInput = findViewById<TextInputEditText>(R.id.editText)
        val button = findViewById<MaterialButton>(R.id.button)

        button.setOnClickListener {
            textInput.setText(
                Foo.reverse(
                    textInput.text.toString()
                )
            )
        }
    }
}
