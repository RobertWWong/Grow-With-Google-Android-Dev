package com.example.android.courtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {
//    https://stackoverflow.com/questions/25905086/multiple-buttons-onclicklistener-android
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Displays the given score for Team A.
     * After a given int argument
     */
    fun displayForTeamA() {
        val scoreView = findViewById(R.id.team_a_score) as TextView
        scoreView.text = score.toString()
    }

    fun pointMade(view: View) {
//        var point_view = findViewById<View>(R.id.team_a_score) as TextView
        when(view.id){      //This is the switch function
            R.id.three_p -> score += 3
            R.id.two_p -> score += 2
            R.id.free_p -> score += 1
        }
        displayForTeamA()
    }

}
