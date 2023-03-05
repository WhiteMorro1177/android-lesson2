package ru.mirea.tsybulko.dialog2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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