package com.example.android.courtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var scoreA = 0
    private var scoreB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Displays the given score for Team A and B
     */
    fun displayForTeams() {
        val teamAview = findViewById(R.id.team_a_score) as TextView
        teamAview .text = scoreA.toString()

        val teamBview = findViewById(R.id.team_b_score) as TextView
        teamBview .text = scoreB.toString()
    }

    /**
    *Reset scores for both team, then displays it on the screen
    */
    fun resetScores (view: View){
        scoreA = 0
        scoreB = 0
        displayForTeams()
    }

    /**
    * Determine which team gets a point via the view id property
    */
    fun pointMade(view: View) {
        when(view.id){      //This is the switch function in Kotlin
            //Team A decisions
            R.id.three_pa -> scoreA += 3
            R.id.two_pa -> scoreA += 2
            R.id.free_pa -> scoreA += 1
            //Team B decisions
            R.id.three_pb -> scoreB += 3
            R.id.two_pb -> scoreB += 2
            R.id.free_pb -> scoreB += 1
        }
        displayForTeams()
    }

}
