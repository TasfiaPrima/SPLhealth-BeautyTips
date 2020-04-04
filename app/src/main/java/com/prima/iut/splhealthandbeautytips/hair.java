package com.prima.iut.splhealthandbeautytips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hair extends AppCompatActivity {
    private Button BtnMove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair);


        BtnMove= findViewById(R.id.button41);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity41();

            }
        });
        BtnMove= findViewById(R.id.button42);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity42();

            }
        });
        BtnMove= findViewById(R.id.button43);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity43();

            }
        });
        BtnMove= findViewById(R.id.button44);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity44();

            }
        });
    }
    private void moveToActivity41(){
        Intent intent=new Intent(hair.this,dandruff.class);
        startActivity(intent);

    }
    private void moveToActivity42(){
        Intent intent=new Intent(hair.this,splitEnds.class);
        startActivity(intent);

    }
    private void moveToActivity43(){
        Intent intent=new Intent(hair.this,grayHair.class);
        startActivity(intent);

    }
    private void moveToActivity44(){
        Intent intent=new Intent(hair.this,hairfall.class);
        startActivity(intent);

    }
}
