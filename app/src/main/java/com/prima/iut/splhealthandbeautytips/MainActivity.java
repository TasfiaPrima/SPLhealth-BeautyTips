package com.prima.iut.splhealthandbeautytips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button BtnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BtnMove= findViewById(R.id.button);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivityOne();
                
            }
        });
        BtnMove= findViewById(R.id.button2);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivityTwo();

            }
        });
        BtnMove= findViewById(R.id.button3);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivityThree();

            }
        });
        BtnMove= findViewById(R.id.button4);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivityFour();

            }
        });
        BtnMove= findViewById(R.id.button5);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivityFive();

            }
        });
        BtnMove= findViewById(R.id.button6);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivitySix();

            }
        });
        BtnMove= findViewById(R.id.button7);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivitySeven();

            }
        });

    }

    private void moveToActivityOne(){
        Intent intent=new Intent(MainActivity.this,eyes.class);
           startActivity(intent);
        
    }

    private void moveToActivityTwo(){
        Intent intent=new Intent(MainActivity.this,face.class);
        startActivity(intent);

    }
    private void moveToActivityThree(){
        Intent intent=new Intent(MainActivity.this,skin.class);
        startActivity(intent);

    }
    private void moveToActivityFour(){
        Intent intent=new Intent(MainActivity.this,hair.class);
        startActivity(intent);

    }
    private void moveToActivityFive(){
        Intent intent=new Intent(MainActivity.this,goodHabits.class);
        startActivity(intent);

    }
    private void moveToActivitySix(){
        Intent intent=new Intent(MainActivity.this,stayFit.class);
        startActivity(intent);

    }
    private void moveToActivitySeven(){
        Intent intent=new Intent(MainActivity.this,food.class);
        startActivity(intent);

    }

}
