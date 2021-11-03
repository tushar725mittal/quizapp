package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String Extra_Topic = "com.example.quiz.extra.TOPIC";
    boolean back = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void topic1(View view){
        Toast.makeText(this, "Starting the QUIZ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,topic1quiz.class);
        intent.putExtra(Extra_Topic,"1");
        startActivity(intent);
    }

    public void topic2(View view){
        Toast.makeText(this, "Starting the QUIZ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,topic1quiz.class);
        intent.putExtra(Extra_Topic,"2");
        startActivity(intent);
    }

    public void topic3(View view){
        Toast.makeText(this, "Starting the QUIZ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,topic1quiz.class);
        intent.putExtra(Extra_Topic,"3");
        startActivity(intent);
    }

    public void topic4(View view){
        Toast.makeText(this, "Starting the QUIZ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,topic1quiz.class);
        intent.putExtra(Extra_Topic,"4");
        startActivity(intent);
    }

    public void topic5(View view){
        Toast.makeText(this, "Starting the QUIZ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,topic1quiz.class);
        intent.putExtra(Extra_Topic,"5");
        startActivity(intent);
    }

    public void topic6(View view){
        Toast.makeText(this, "Starting the QUIZ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,topic1quiz.class);
        intent.putExtra(Extra_Topic,"6");
        startActivity(intent);
    }
}