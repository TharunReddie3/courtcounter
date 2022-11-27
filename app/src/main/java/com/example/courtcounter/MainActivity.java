package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(3);
    }
    /**
     * Displays the given score for Team A.
     */
    int score_a=0;
    int score_b=0;
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void show_3(View view) {
        score_a=score_a+3;
        displayForTeamA(score_a);
    }

    public void show_2(View view) {
        score_a=score_a+2;
        displayForTeamA(score_a);
    }

    public void show_1(View view) {
        score_a=score_a+1;
        displayForTeamA(score_a);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void show_3b(View view) {
        score_b=score_b+3;
        displayForTeamB(score_b);
    }

    public void show_2b(View view) {
        score_b=score_b+2;
        displayForTeamB(score_b);
    }

    public void show_1b(View view) {
        score_b=score_b+1;
        displayForTeamB(score_b);
    }

    public void reset(View view) {
        score_b=0;
        score_a=0;
        displayForTeamB(score_b);
        displayForTeamA(score_a);
    }
}