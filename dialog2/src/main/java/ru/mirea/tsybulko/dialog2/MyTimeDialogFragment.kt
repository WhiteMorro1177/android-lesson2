package ru.mirea.tsybulko.dialog2

import android.app.TimePickerDialog
import android.app.TimePickerDialog.OnTimeSetListener
import android.content.Context
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDateTime

class MyTimeDialogFragment(private val ctx: Context) {

    // init
    private val timePickerDialog: TimePickerDialog =
        TimePickerDialog(
            ctx,
            initListener(ctx),
            LocalDateTime.now().hour,
            LocalDateTime.now().minute,
            true)

    // create listener
    private fun initListener(ctx: Context): OnTimeSetListener {
        val listener = OnTimeSetListener() { _, hourOfDay, minute ->
            val timeButton: Button = (ctx as AppCompatActivity).findViewById(R.id.button6)
            timeButton.text = "$hourOfDay:$minute"
        }
        return listener
    }

    // start dialog
    public fun show() {
        timePickerDialog.show()
    }
}