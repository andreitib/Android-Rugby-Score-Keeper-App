package com.example.android.P2ScoreKeeperApp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Increase the score for Team A by 5 points.
     */
    public void addFiveForTeamA(View v) {

        displayForTeamA(5);
        scoreTeamA=scoreTeamA+5;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        displayForTeamA(2);
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {

        displayForTeamA(3);
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */

    public void resetScore(View V){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamB(scoreTeamA);
        displayForTeamA(scoreTeamB);
    }
    int scoreTeamB=0;
    public void addFiveForTeamB(View v) {

        displayForTeamB(5);
        scoreTeamB=scoreTeamB+5;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamB(View v) {
        displayForTeamB(2);
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamB(View v) {
        displayForTeamB(3);
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}