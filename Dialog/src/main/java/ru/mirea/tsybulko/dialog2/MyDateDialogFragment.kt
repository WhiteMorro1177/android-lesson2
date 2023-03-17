package ru.mirea.tsybulko.dialog2

import android.app.DatePickerDialog
import android.content.Context
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDate

class MyDateDialogFragment(private val ctx: Context) : DatePickerDialog(ctx) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setOnDateSetListener { _, year, month, dayOfMonth ->
            try {

                val dateTextView: TextView =
                    (ctx as AppCompatActivity).findViewById(R.id.dateTextView)
                val date: String = LocalDate.of(year, month, dayOfMonth).toString()

                date.also { dateTextView.text = it }
            } catch (exc: Exception) {
                Toast.makeText(ctx, "Error! ${exc.message}", Toast.LENGTH_LONG).show()
            }
        }
    }
}