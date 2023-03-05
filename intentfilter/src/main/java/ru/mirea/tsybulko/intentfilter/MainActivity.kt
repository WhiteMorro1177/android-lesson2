package ru.mirea.tsybulko.intentfilter

import android.content.Intent
import android.content.Intent.ACTION_SEND
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun uriButtonCLick(view: View) {
        val uriLink: Uri = Uri.parse("https://kotlinlang.org/docs/basic-syntax.html")
        val goToLinkIntent = Intent(Intent.ACTION_VIEW, uriLink)

        startActivity(goToLinkIntent)
    }

    fun sharePersonInfo(view: View) {
        val intentToShare = Intent().apply {
            action = ACTION_SEND
            type = "text/plain"
            putExtra(Intent.EXTRA_SUBJECT, "Person")
            putExtra(Intent.EXTRA_TEXT, "Цыбулько Артём Дмитриевич")
        }

        startActivity(Intent.createChooser(intentToShare, "Creator Info"))
    }
}