package com.example.android.courtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView



class MainActivity : AppCompatActivity() {
//    https://stackoverflow.com/questions/25905086/multiple-buttons-onclicklistener-android
    private var score = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Displays the given score for Team A.
     * After a given int argument
     */
    fun displayForTeamA(score: Int) {
        val scoreView = findViewById(R.id.team_a_score) as TextView
        scoreView.text = score.toString()
    }

}
