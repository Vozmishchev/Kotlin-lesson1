package ru.gb.kotlin_lesson1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.os.Bundle
import android.view.View
import android.widget.Button
import ru.gb.kotlin_lesson1.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPush: Button = findViewById(R.id.button_push)
        val textView: TextView = findViewById(R.id.text_view)

        buttonPush.setOnClickListener(View.OnClickListener { view ->
            textView.text = "Ok"
            view.setBackgroundColor(Color.BLUE)
        })
    }
}