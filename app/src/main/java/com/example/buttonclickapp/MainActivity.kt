package com.example.buttonclickapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

// Logging capabilities
private val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private var textView: TextView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate: Called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput: EditText = findViewById<EditText>(R.id.editText)
        val button: Button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod() // Allows scrolling in textView


        userInput.text.clear()

        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                Log.d(TAG,"onClick: Called")
                textView?.append(userInput.text)
                textView?.append("\n")

                // Clear input on click
                userInput.text.clear()
                //userInput.setText("")
            }
        })
    }
}
