package com.example.legenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameScreenasd11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen1c1);
    }
    public void selectChoice1(View view){//MoveLayout to next GameScreen c1
        Intent intent = new Intent(GameScreenasd11.this, GameScreen2c1.class);
        startActivity(intent);
    }
    public void selectChoice2(View view){//MoveLayout to next GameScreen c2
        Intent intent = new Intent(GameScreenasd11.this, GameScreen2c1.class);
        startActivity(intent);
    }
}