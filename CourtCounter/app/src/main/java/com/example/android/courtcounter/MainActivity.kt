package com.example.android.courtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatViewInflater
import android.view.View
import android.widget.TextView
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {
    private var scoreA = 0
    private var scoreB = 0
    private var foulA = 0
    private var foulB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Displays the given score for Team A and B
     */
    private fun displayForTeams() {
        val teamAview = findViewById<TextView>(R.id.team_a_score)
        teamAview.text ="%d : %d".format(scoreA, foulA)

        val teamBview = findViewById<TextView>(R.id.team_b_score)
        teamBview.text ="%d : %d".format(scoreB, foulB)
    }

    /**
     * A timer function which executes only when the foul button has been clicked
     * It will display the team name committing the foul, and the points lost
     * After 1.5 seconds, the timer will hide the foul text view.
     */
    //Crashes after specified time
    //Cannot modify root view if on a different thread. Leave this for a another day
//    private fun foulTextUpdate(viewID: TextView, team: Int) {
//        val timer = Timer("schedule", true)
//        viewID.text = "FOUL MADE BY TEAM %s: -2 POINTS".format(if (team == 1) "A" else "B")
//        viewID.visibility = View.VISIBLE
//        timer.schedule(2500) {
//            println("Please work")
//            viewID.visibility = View.INVISIBLE
//            timer.cancel()
//        }
//        println("Done with pop up")
//    }

    /**
     *Reset scores for both team, then displays it on the screen
     */
    fun resetScores(view: View) {
        scoreA = 0
        scoreB = 0
        foulA = 0
        foulB = 0
        displayForTeams()
    }


    /**
     * Determine which team gets a point via the view id property
     * Instead of creating 6 separate functions to affect team scoring,
     * have a switch(when) statement that listens to which button was pressed
     * and change the scores accordingly.
     */
    fun pointMadeDecider(view: View) {

        when (view.id) {      //This is the switch function in Kotlin
        //Team A decisions
            R.id.three_pa -> scoreA += 3
            R.id.two_pa -> scoreA += 2
            R.id.free_pa -> scoreA += 1
            R.id.foul_a2 -> {
                scoreA -= 2
                foulA -= 1
//                val foulMade = findViewById<TextView>(R.id.foul_text)     //This line of code was for the fade-in-out feature when a team made a foul
//                foulTextUpdate(foulMade, 1)
            }
        //Team B decisions
            R.id.three_pb -> scoreB += 3
            R.id.two_pb -> scoreB += 2
            R.id.free_pb -> scoreB += 1
            R.id.foul_b2 -> {
                scoreB -= 2
                foulB -= 1
//                val foulMade = findViewById<TextView>(R.id.foul_text)
//                foulTextUpdate(foulMade, 2)
            }
        }
        displayForTeams()
    }

}
