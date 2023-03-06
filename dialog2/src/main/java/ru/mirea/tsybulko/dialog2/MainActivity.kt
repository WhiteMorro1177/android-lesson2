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
        // val progressTextView = findViewById<TextView>(R.id.progressTextView)


        val time: String = getCurrentTime("hh:mm")
        val date: String = getCurrentDate("dd.MM.yyyy")
        timeTextView.text = time
        dateTextView.text = date
    }

    private fun getCurrentTime(format: String): String {

        // multiply format with time

        val current = LocalDateTime.now()
        return "${current.hour}:${if (current.minute.toString().length < 2) ("0${current.minute}") else (current.minute)}"
    }

    private fun getCurrentDate(format: String): String {

        // multiply format with dates

        val current = LocalDate.now()
        val currentDay =
            if (current.dayOfMonth.toString().length < 2) (current.dayOfMonth.toString()) else ("0${current.dayOfMonth}")
        val currentMonth =
            if (current.month.toString().length < 2) (current.month.toString()) else ("0${current.month}")

        return "$currentDay.$currentMonth.${current.year}"
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
        TODO("learn things about progress dialog")
    }
}