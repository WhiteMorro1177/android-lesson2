package ru.mirea.tsybulko.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class SideActivity : AppCompatActivity() {
    private var TAG: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side)
        Log.d(TAG, "Side onCreate")

        val extras: Bundle? = intent.extras
        val textView: TextView = findViewById(R.id.textView2)

        TAG = extras?.getString("tag").toString()
        textView.text = extras?.getString("plainTextValue").toString()

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Side onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Side onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Side onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Side onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Side onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Side onDestroy")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "Side onRestoreInstantState")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "Side onSaveInstantState")
    }
}