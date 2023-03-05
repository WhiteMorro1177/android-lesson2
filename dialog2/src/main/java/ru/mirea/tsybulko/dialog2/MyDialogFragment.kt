package ru.mirea.tsybulko.dialog2

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class MyDialogFragment: DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity).apply {
            setTitle("Title")
            setMessage("Message")
            setIcon(R.drawable.ic_launcher_foreground)
            setPositiveButton("Positive") { dialog, _ -> dialog.cancel() }
            setNeutralButton("Neutral") { dialog, _ -> dialog.cancel() }
            setNegativeButton("Negative") { dialog, _ -> dialog.cancel() }
        }

        return builder.create()
    }

}
