package ru.mirea.tsybulko.dialog2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeTextView = findViewById<TextView>(R.id.timeTextView)
        val currentTime = LocalDateTime.now()
        timeTextView.text = "${currentTime.hour}:${if (currentTime.minute.toString().length < 2) ("0${currentTime.minute}") else (currentTime.minute)}"
    }

    fun onClickShowDialog(view: View) {
        val dialog = MyDialogFragment()
        dialog.show(supportFragmentManager, "Tag")
    }

    fun showTimeDialog(view: View) {
        val dialog = MyTimeDialogFragment(this)
        dialog.show()
    }
}