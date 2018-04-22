package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void set3PointsTeamA(View view){
        scoreTeamA += 3;
        displayScoreA(scoreTeamA);
    }
    public void set2PointsTeamA(View view){
        scoreTeamA += 2;
        displayScoreA(scoreTeamA);
    }
    public void freeThrowA(View view){
        scoreTeamA += 1;
        displayScoreA(scoreTeamA);
    }
    public void set3PointsTeamB(View view){
        scoreTeamB += 3;
        displayScoreB(scoreTeamB);
    }
    public void set2PointsTeamB(View view){
        scoreTeamB += 2;
        displayScoreB(scoreTeamB);
    }
    public void freeThrowB(View view){
        scoreTeamB += 1;
        displayScoreB(scoreTeamB);
    }
    public void displayScoreA(int number){
        TextView scoreTextViewA = (TextView) findViewById(R.id.team_a_score);
        scoreTextViewA.setText(""+number);
    }
    public void displayScoreB(int number){
        TextView scoreTextViewB = (TextView) findViewById(R.id.team_b_score);
        scoreTextViewB.setText(""+number);
    }
    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreA(scoreTeamA);
        displayScoreB(scoreTeamB);
    }
}
