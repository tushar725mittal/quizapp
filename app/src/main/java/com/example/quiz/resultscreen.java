package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
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
        int Score = Integer.parseInt(score);
        String res;
        if(Score>9){
            res = "Excellent!!\nYou have a Perfect Score\n\nScore : "+ score;
            clapping.start();
        }
        else if(Score>7){
            res = "Good!!\nYou have a Almost a Perfect Score\n\nScore : "+ score;
            clapping.start();
        }
        else{
            res = "Try Again!!\nYou need to brush up your knowledge\n\nScore : "+ score;
        }
        result = findViewById(R.id.result);
        result.setText(res);
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