package eu.tutorials.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val txtClickMe = findViewById<TextView>(R.id.textView)

        var timesClicked = 0


        btnClickMe.setOnClickListener {
            timesClicked += 1
            txtClickMe.text = timesClicked.toString()
            Toast.makeText(this, "New Toast Feature", Toast.LENGTH_SHORT).show()
        }


    }
}