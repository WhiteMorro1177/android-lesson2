package ru.mirea.tsybulko.dialog2

import android.app.ProgressDialog
import android.content.Context
import android.os.Bundle
import android.widget.Toast

class MyProgressDialogFragment(private val ctx: Context): ProgressDialog(ctx) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Progress Dialog")
        setMessage("Application is loading, please wait")

        setOnCancelListener() {
            Toast.makeText(ctx, "Loading is complete", Toast.LENGTH_SHORT).show()
        }
    }
}