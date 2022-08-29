package com.example.pract_3_mihir_intend

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val Tag = "MainActivity"
    val extraMessage = "com.example.pract_3_mihir_intend.Message"
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        extraMessage = findViewById(R.id.)
    }

    fun LaunchSecondActivity(view: View) {
        Log.d(Tag, "Okay")
        intent= Intent(this,secondActivity::class.java)
        startActivity(intent)
    }
}
