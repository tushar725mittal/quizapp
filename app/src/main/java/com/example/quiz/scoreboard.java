package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class scoreboard extends AppCompatActivity {
    private TextView scoreview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);
        Intent intent = getIntent();
        scoreview = findViewById(R.id.scoreview);
        List<Player>players;
        DbHandler handler = new DbHandler(this, "scoredb", null, 1);
        players = handler.getPlayerTable();
        if(players != null){
            StringBuffer sb = new StringBuffer();
            sb.append("Player : High-Score\n");
            for(Player player : players){
//            Log.d("mytag", player.getPlayerName());
                sb.append(player.getPlayerName() + " : " + player.getScore() + "\n");
            }
            scoreview.setText(sb.toString());
        }
        handler.close();
    }
}