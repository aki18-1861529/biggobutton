package edu.washington.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var clickCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            clickCount += 1
            if (clickCount == 1) {
                btn.text = getString(R.string.first_click)
            } else {
                btn.text = "You have pushed me " + clickCount + " times!"
            }
        }
    }
}