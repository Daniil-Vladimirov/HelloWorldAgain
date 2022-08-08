package com.example.helloworldagain

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var mCount: Int = 0
    private var countView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        countView = findViewById(R.id.tv_show_count)

        Log.d("MainActivity", "Hello World")
    }

    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }

    fun countUp(view: View) {
        mCount++
        countView?.text = mCount.toString()
    }
}