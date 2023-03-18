package ru.mirea.tsybulko.lesson2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private val TAG: String = "ActivityInvoking"
    private var plainTextField: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Main onCreate")
        plainTextField = findViewById(R.id.plainText1)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Main onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Main onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Main onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Main onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Main onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Main onDestroy")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "Main onRestoreInstantState")
        val savedPlainTextValue: String? = savedInstanceState.getString("plainText")
        plainTextField?.text = savedPlainTextValue as Editable
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val textToSave = plainTextField?.text.toString()
        Log.d(TAG, "Main onSaveInstantState || saved: $textToSave")
        outState.putString("plainText", textToSave)
    }

    fun invokeSideActivity(view: View) {
        val sideActivity: Intent = Intent(this, SideActivity::class.java)
        sideActivity.putExtra("plainTextValue", plainTextField?.text.toString())
        sideActivity.putExtra("tag", TAG)
        startActivity(sideActivity)
    }


}