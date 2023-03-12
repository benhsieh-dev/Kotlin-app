package eu.tutorials.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        btnClickMe.setOnClickListener {
            btnClickMe.text = "Kotlin app"
        }

        val txtClickMe = findViewById<TextView>(R.id.textView)
        btnClickMe.setOnClickListener {
            btnClickMe.text = "Kotlin app"
            txtClickMe.text = "Kotlin developer"
        }
    }
}