package ru.mirea.tsybulko.lesson2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowInsets.Side
import android.widget.EditText
import android.widget.TextView
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {
    private val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstantState")
        val savedPlainTextValue: String? = savedInstanceState.getString("plainText")
        findViewById<EditText>(R.id.plainText1).setText(savedPlainTextValue)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstantState || saved: ${findViewById<EditText>(R.id.plainText1).text}")
        outState.putString("plainText", findViewById<EditText>(R.id.plainText1).text.toString())
    }

    fun invokeSideActivity(view: View) {
        val sideActivity: Intent = Intent(this, SideActivity::class.java)
        sideActivity.putExtra("plainTextValue", findViewById<EditText>(R.id.plainText1).text.toString())
        startActivity(sideActivity)
    }


}