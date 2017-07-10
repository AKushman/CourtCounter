package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    final int THREE_POINTS = 3;
    final int TWO_POINTS = 2;
    final int ONE_POINT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String jamesbond = "hi";
        String jamesBond = "hello";
        String s = jamesBond + jamesbond;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimpSlifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void addThreeForA(View view) {
        scoreTeamA += THREE_POINTS;
        displayForTeamA();
    }

    public void addTwoForA(View view) {
        scoreTeamA += TWO_POINTS;
        displayForTeamA();
    }

    public void addOneForA(View view) {
        scoreTeamA += ONE_POINT;
        displayForTeamA();
    }

    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void addThreeForB(View view) {
        scoreTeamB += THREE_POINTS;
        displayForTeamB();
    }

    public void addTwoForB(View view) {
        scoreTeamB += TWO_POINTS;
        displayForTeamB();
    }

    public void addOneForB(View view) {
        scoreTeamB += ONE_POINT;
        displayForTeamB();
    }

    public void resetScore(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA();
        displayForTeamB();
    }
}
