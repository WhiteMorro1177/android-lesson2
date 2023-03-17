package ru.mirea.tsybulko.dialog2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.time.LocalDate
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // create main activity
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // bind components
        val timeTextView = findViewById<TextView>(R.id.timeTextView)
        val dateTextView = findViewById<TextView>(R.id.dateTextView)


        val time: String = getCurrentTime()
        timeTextView.text = time
        dateTextView.text = LocalDate.now().toString()
    }

    private fun getCurrentTime(/* format: String */): String {
        val current = LocalDateTime.now()
        return "${current.hour}:${if (current.minute.toString().length < 2) ("0${current.minute}") else (current.minute)}"
    }

    fun onClickShowDialog(view: View) {
        val dialog = MyDialogFragment()
        dialog.show(supportFragmentManager, "Tag")
    }

    fun showTimeDialog(view: View) {
        val dialog = MyTimeDialogFragment(this)
        dialog.show()
    }

    fun showDateDialog(view: View) {
        val dialog = MyDateDialogFragment(this)
        dialog.show()
    }

    fun showProgressDialog(view: View) {
        val dialog = MyProgressDialogFragment(this)
        dialog.show()
    }
}