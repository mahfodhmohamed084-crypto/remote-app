package com.remote.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this).apply {
            text = "Remote Control\n\nالتطبيق جاهز"
            textSize = 24f
            setPadding(40, 100, 40, 40)
        }

        setContentView(text)
    }
}
