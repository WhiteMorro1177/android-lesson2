package ru.mirea.tsybulko.toastapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun countTextLength(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        Toast.makeText(
            this,
            "Student: 25, Group: BSBO-07-21, Symbols counter: ${editText.text.length}",
            Toast.LENGTH_SHORT,
        ).show()
    }
}