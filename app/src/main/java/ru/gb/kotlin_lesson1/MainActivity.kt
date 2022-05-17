package ru.gb.kotlin_lesson1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import ru.gb.kotlin_lesson1.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPush: Button = findViewById(R.id.button_push)
        val textView: TextView = findViewById(R.id.text_view)
        val textView2: TextView = findViewById(R.id.text_view2)

        val film1 = Film("Breakout", 1975)
        val film2 = film1.copy(year = 1985)

        Book.author = "Антон Павлович Чехов"
        Book.titleBook = "Вишневый сад"
        Book.year = 1903
        Book.info()

        buttonPush.setOnClickListener { view ->
            view.setBackgroundColor(Color.BLUE)
            textView.text = film1.toString()
            textView2.text = film2.toString()
        }
    }
}



