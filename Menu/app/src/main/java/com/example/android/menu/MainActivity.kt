package com.example.android.menu

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun printToLogs(view: View) {
        // Find first menu item TextView and print the text to the logs
        val first = findViewById<TextView>(R.id.menu_item_1)
        Log.v("Within printToLogs", first.text as String?)
        // Find second menu item TextView and print the text to the logs
        val second = findViewById<TextView>(R.id.menu_item_2)
        Log.v("2nd tag", second.text as String?)
        // Find third menu item TextView and print the text to the logs
        val third= findViewById<TextView>(R.id.menu_item_3)
        Log.v("Within printToLogs", third.text as String?)

        //The tag text is only displayed once per function call, I wonder what will happen if that
        //Tag text is different for each Log.v invocation
        //Yep, every consecutive tag with the same text value will not be logged on invocation
    }
}