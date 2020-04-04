package com.prima.iut.splhealthandbeautytips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eyes extends AppCompatActivity {
    private Button BtnMove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eyes);
        BtnMove = findViewById(R.id.button11);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity11();

            }
        });
        BtnMove = findViewById(R.id.button12);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity12();

            }
        });
        BtnMove = findViewById(R.id.button13);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity13();

            }
        });
        BtnMove = findViewById(R.id.button14);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity14();

            }
        });
    }
    private void moveToActivity11(){
        Intent intent=new Intent(eyes.this,darkCircles.class);
        startActivity(intent);

    }
    private void moveToActivity12(){
        Intent intent=new Intent(eyes.this,sunkenEyes.class);
        startActivity(intent);

    }
    private void moveToActivity13(){
        Intent intent=new Intent(eyes.this,puffyEyes.class);
        startActivity(intent);

    }
    private void moveToActivity14(){
        Intent intent=new Intent(eyes.this,contactLenses.class);
        startActivity(intent);

    }
    }
