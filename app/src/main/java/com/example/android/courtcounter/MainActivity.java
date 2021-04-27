package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private int scoreA = 0;
    private int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementOneTeamAScore(View view){
        scoreA = scoreA + 1;
        displayScoreTeamA(scoreA);
    }

    public void incrementTwoTeamAScore(View view){
        scoreA = scoreA + 2;
        displayScoreTeamA(scoreA);
    }

    public void incrementThreeTeamAScore(View view){
        scoreA = scoreA + 3;
        displayScoreTeamA(scoreA);
    }

    public void incrementOneTeamBScore(View view){
        scoreB = scoreB + 1;
        displayScoreTeamB(scoreB);
    }

    public void incrementTwoTeamBScore(View view){
        scoreB = scoreB + 2;
        displayScoreTeamB(scoreB);
    }

    public void incrementThreeTeamBScore(View view){
        scoreB = scoreB + 3;
        displayScoreTeamB(scoreB);
    }

    public void resetScore(View view){
        scoreA = 0;
        scoreB = 0;
        displayScoreTeamA(scoreA);
        displayScoreTeamB(scoreB);
    }

    private void displayScoreTeamA(int score) {
        TextView teamAScore = (TextView) findViewById(R.id.team_a_score);
        teamAScore.setText(String.valueOf(score));
    }

    private void displayScoreTeamB(int score) {
        TextView teamAScore = (TextView) findViewById(R.id.team_b_score);
        teamAScore.setText(String.valueOf(score));
    }
}