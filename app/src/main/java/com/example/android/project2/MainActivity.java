package com.example.android.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;
    int teamAcards = 0;
    int teamBcards = 0;

    int ScoreTeamAGame1 = 0;

    int ScoreTeamBGame1 = 0;

    int teamACardsGame1 = 0;

    int teamBCardsGame1 = 0;

    private final String TEAMASCORE_KEY = "teamascore_key";
    private final String TEAMBSCORE_KEY = "teambscore_key";
    private final String TEAMACARD_KEY = "teamacard_key";
    private final String TEAMBCARD_KEY = "teambcard_key";
    private final String GAME1TEAMASCORE_KEY = "game1teamascore_key";
    private final String GAME1TEAMBSCORE_KEY = "game1teambscore_key";
    private final String GAME1TEAMACARD_KEY = "game1teamacard_key";
    private final String GAME1TEAMBCARD_KEY = "game1teambcard_key";
    private final String SUBMITTED_KEY = "submitted-key";
    private boolean submitted = false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            teamAScore = savedInstanceState.getInt(TEAMASCORE_KEY);
            teamBScore = savedInstanceState.getInt(TEAMBSCORE_KEY);
            teamAcards = savedInstanceState.getInt(TEAMACARD_KEY);
            teamBcards = savedInstanceState.getInt(TEAMBCARD_KEY);
            ScoreTeamAGame1 = savedInstanceState.getInt(GAME1TEAMASCORE_KEY);
            ScoreTeamBGame1 = savedInstanceState.getInt(GAME1TEAMBSCORE_KEY);
            teamACardsGame1 = savedInstanceState.getInt(GAME1TEAMACARD_KEY);
            teamBCardsGame1 = savedInstanceState.getInt(GAME1TEAMBCARD_KEY);
            displayForTeamA(teamAScore);
            displayForTeamB(teamBScore);
            displayCardsForTeamA(teamAcards);
            displayCardsForTeamB(teamBcards);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(TEAMASCORE_KEY, teamAScore);
        outState.putInt(TEAMBSCORE_KEY, teamBScore);
        outState.putInt(TEAMACARD_KEY, teamAcards);
        outState.putInt(TEAMBCARD_KEY, teamBcards);
        outState.putInt(GAME1TEAMASCORE_KEY, ScoreTeamAGame1);
        outState.putInt(GAME1TEAMBSCORE_KEY, ScoreTeamBGame1);
        outState.putInt(GAME1TEAMACARD_KEY, teamACardsGame1);
        outState.putInt(GAME1TEAMBCARD_KEY, teamBCardsGame1);
        outState.putBoolean(SUBMITTED_KEY, submitted);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            submitted = savedInstanceState.getBoolean(SUBMITTED_KEY);

        }
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

    public void firstgame(View view) {
        ScoreTeamAGame1 = teamAScore;
        teamAScore = 0;
        displayForTeamA(teamAScore);
        ScoreTeamBGame1 = teamBScore;
        teamBScore = 0;
        displayForTeamB(teamBScore);
        teamACardsGame1 = teamAcards;
        teamAcards = 0;
        displayCardsForTeamA(teamAcards);
        teamBCardsGame1 = teamBcards;
        teamBcards = 0;
        displayCardsForTeamB(teamBcards);
    }

    public void finalScore(View view) {
        teamAScore = teamAScore + ScoreTeamAGame1;
        displayForTeamA(teamAScore);
        teamBScore = teamBScore + ScoreTeamBGame1;
        displayForTeamB(teamBScore);
        teamAcards = teamAcards + teamACardsGame1;
        teamBcards = teamBcards + teamACardsGame1;
        displayCardsForTeamA(teamAcards);
        displayCardsForTeamB(teamBcards);

    }

    public void restart(View view) {
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
