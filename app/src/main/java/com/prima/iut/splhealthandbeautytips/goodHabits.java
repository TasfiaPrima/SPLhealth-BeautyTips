package com.prima.iut.splhealthandbeautytips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class goodHabits extends AppCompatActivity {
    private Button BtnMove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_habits);
        BtnMove = findViewById(R.id.button51);
        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity51();

            }
        });
        BtnMove = findViewById(R.id.button52);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity52();

            }
        });
    }
    private void moveToActivity51() {
        Intent intent = new Intent(goodHabits.this, forAdult.class);
        startActivity(intent);

    }

    private void moveToActivity52() {
        Intent intent = new Intent(goodHabits.this, forKids.class);
        startActivity(intent);

    }
}
