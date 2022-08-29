package com.example.pract_3_mihir_intend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var message = extraMessage.toString
        setContentView(R.layout.activity_second)
    }

}