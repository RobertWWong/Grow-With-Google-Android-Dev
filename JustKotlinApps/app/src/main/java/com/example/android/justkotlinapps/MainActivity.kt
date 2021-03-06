package com.example.android.justkotlinapps

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //creating text with kotlin is a bit different. We need to have some context within an existing layout
        //in order to create a dynamic view
        val lin_lay_main = findViewById<LinearLayout>(R.id.test_layout)

        val someTextObj = TextView(this)
        someTextObj.text = "Life is fine and dandy until taxes come."
        someTextObj.textSize = 20f
        someTextObj.setTextColor(Color.RED)

        lin_lay_main.addView(someTextObj)
    }
}
