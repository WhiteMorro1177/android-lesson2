package ru.mirea.tsybulko.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side)

        val extras: Bundle? = intent.extras
        Log.d(this.localClassName, "${extras?.getString("plainTextValue")}")
    }
}