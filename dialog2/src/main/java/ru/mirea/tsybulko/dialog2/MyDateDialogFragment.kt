package ru.mirea.tsybulko.dialog2

import android.app.DatePickerDialog
import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MyDateDialogFragment(private val ctx: Context) : DatePickerDialog(ctx) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.setOnDateSetListener { _, year, month, dayOfMonth ->
            val dateTextView: TextView = (ctx as AppCompatActivity).findViewById(R.id.dateTextView)

            val date = "${if (dayOfMonth.toString().length < 2) ("0$dayOfMonth") else (dayOfMonth)}." +
                    "${if (month.toString().length < 2) ("0$month") else (month)}." +
                    "$year"

            date.also { dateTextView.text = it }
        }
    }
}