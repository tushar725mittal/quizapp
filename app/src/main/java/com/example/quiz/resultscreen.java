package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class resultscreen extends AppCompatActivity {
    TextView result;
    MediaPlayer clapping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultscreen2);
        clapping = MediaPlayer.create(resultscreen.this, R.raw.clapping);
        Intent intent = getIntent();
        String score = intent.getStringExtra(topic1quiz.Extra_Name);
        String playerName = intent.getStringExtra(topic1quiz.Extra_Name + "playerName");
        int Score = Integer.parseInt(score);
        DbHandler handler = new DbHandler(this, "scoredb", null, 1 );
        Player previous_player_details = handler.getPlayerScore(playerName);
        String res;
        if(Score>9){
            res = "Excellent, "+ playerName + " !!\nYou have a Perfect Score\n\nScore : "+ score;
            clapping.start();
        }

        else if(Score>7){
            res = "Good, " + playerName + " !!\nYou have a Almost a Perfect Score\n\nScore : "+ score;
            clapping.start();
        }
        else{
            res = "Try Again, " + playerName + " !!\nYou need to brush up your knowledge\n\nScore : "+ score;
        }
        result = findViewById(R.id.result);
        if (previous_player_details == null) {
            result.setText(res);
        }
        else{
             result.setText(res + "\nYour Hi-Score : " + previous_player_details.getScore());
        }
        if(previous_player_details == null){
            handler.addPlayer(new Player(1,playerName, Score));
        }
        else if(previous_player_details.getScore() < Score){
            handler.updateScore(new Player(previous_player_details.getSno(), previous_player_details.getPlayerName(), Score));
        }
//        handler.getPlayerTable();
//        handler.getPlayerScore(playerName);

        handler.close();

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (clapping.isPlaying()) {
            clapping.stop(); // or mp.pause();
            clapping.release();
        }
    }
}