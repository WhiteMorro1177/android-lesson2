package ru.mirea.tsybulko.dialog2

import android.app.TimePickerDialog
import android.app.TimePickerDialog.OnTimeSetListener
import android.content.Context
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MyTimeDialogFragment(ctx: Context) {

    // main object
    private val timePickerDialog: TimePickerDialog

    // init
    init {
        val activity = ctx as AppCompatActivity
        val tv = activity.findViewById<TextView>(R.id.timeTextView)


        assert(tv.text.split(":").size == 2)
        val hours: Int = tv.text.split(":")[0].toInt()
        val minutes: Int = tv.text.split(":")[1].toInt()

        timePickerDialog = TimePickerDialog(ctx, initListener(ctx), hours, minutes, true)
    }

    // create listener
    private fun initListener(ctx: AppCompatActivity): OnTimeSetListener {
        return OnTimeSetListener() { _, hours, minutes ->
            // dialog logic -- work when new time set

            val funcMinutes: String = if (minutes.toString().length < 2) ("0$minutes") else (minutes.toString()) // adding "0" to minutes
            val tv = ctx.findViewById<TextView>(R.id.timeTextView)
            tv.text = "$hours:$funcMinutes"
        }
    }

    // start dialog
    public fun show() {
        timePickerDialog.show()
    }
}