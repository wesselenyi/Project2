package com.example.android.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.project2.R;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;

    int teamBScore = 0;

    int teamAcards = 0;
    int teamBcards = 0;

    int ScoreTeamAG1 = 0;

    int ScoreTeamBG1 = 0;

    int teamACardsG1 = 0;

    int teamBCardsG1 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCardsForTeamA(int cards) {
        TextView cardsView = (TextView) findViewById(R.id.team_a_cards);
        cardsView.setText(String.valueOf(cards));
    }

    public void displayCardsForTeamB(int cards) {
        TextView cardsView = (TextView) findViewById(R.id.team_b_cards);
        cardsView.setText(String.valueOf(cards));
    }

    public void firstgame (View view) {
        ScoreTeamAG1 = teamAScore;
        teamAScore = 0;
        displayForTeamA(teamAScore);
        ScoreTeamBG1 = teamBScore;
        teamBScore = 0;
        displayForTeamB(teamBScore);
        teamACardsG1 = teamAcards;
        teamAcards = 0;
        displayCardsForTeamA(teamAcards);
        teamBCardsG1 = teamBcards;
        teamBcards = 0;
        displayCardsForTeamB(teamBcards);
    }

    public void finalScore(View view) {
        teamAScore = teamAScore + ScoreTeamAG1;
        displayForTeamA(teamAScore);
        teamBScore = teamBScore + ScoreTeamBG1;
        displayForTeamB(teamBScore);
        teamAcards = teamAcards + teamACardsG1;
        teamBcards = teamBcards + teamACardsG1;
        displayCardsForTeamA(teamAcards);
        displayCardsForTeamB(teamBcards);

    }

    public void restart (View view) {
        teamAScore = 0;
        displayForTeamA(teamAScore);
        teamBScore = 0;
        displayForTeamB(teamBScore);
        teamAcards = 0;
        teamBcards = 0;
        displayCardsForTeamA(teamAcards);
        displayCardsForTeamB(teamBcards);

    }
    public void GoalForTeamA(View v) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }


    public void GoalForTeamB(View view) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }


    public void CardForTeamA(View view) {
        teamAcards = teamAcards + 1;
        displayCardsForTeamA(teamAcards);
    }

    public void CardForTeamB(View view) {
        teamBcards = teamBcards + 1;
        displayCardsForTeamB(teamBcards);
    }

}
