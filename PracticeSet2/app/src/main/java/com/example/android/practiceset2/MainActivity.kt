package com.example.android.practiceset2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    //Display methods to screen

    public fun display(text: String){
        val t = findViewById<TextView>(R.id.display_text_view)
        t.text = text
    }

    public fun display(num: Int) {
        val t = findViewById<TextView>(R.id.display_text_view)
        t.text = num + ""
    }

    public fun display1(text: String) {
        display(text)
    }

    public fun display2(text: String) {
        val t = findViewById<TextView>(R.id.display_text_view_2)
        t.text = text
    }

    public fun display3(text: String) {
        val t = findViewById<TextView>(R.id.display_text_view_3)
        t.text = text
    }


}
