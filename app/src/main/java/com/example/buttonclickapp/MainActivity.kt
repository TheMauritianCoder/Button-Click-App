package com.example.buttonclickapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var userInput : EditText? = null
    private var button: Button?= null
    private var textView: TextView?= null
    private var numberOfTimesClicked = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userInput = findViewById<EditText>(R.id.editText)
        button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod() // Allows scrolling in textView

        // Long Version
        button?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                numberOfTimesClicked += 1
                textView?.append("The Button got tapped $numberOfTimesClicked time")
                if(numberOfTimesClicked > 1){
                    textView?.append("s")
                }
                textView?.append("\n")
            }
        })

        // Short Version
    }
}
