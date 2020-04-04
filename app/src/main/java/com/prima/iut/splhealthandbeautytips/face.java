package com.prima.iut.splhealthandbeautytips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class face extends AppCompatActivity {
    private Button BtnMove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face);

        BtnMove = findViewById(R.id.button21);
        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity21();

            }
        });
        BtnMove = findViewById(R.id.button22);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity22();

            }
        });
        BtnMove = findViewById(R.id.button23);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity23();

            }
        });

    }
    private void moveToActivity21(){
        Intent intent=new Intent(face.this,lipCare.class);
        startActivity(intent);

    }
    private void moveToActivity22(){
        Intent intent=new Intent(face.this,blackheads.class);
        startActivity(intent);

    }
    private void moveToActivity23(){
        Intent intent=new Intent(face.this,acne.class);
        startActivity(intent);

    }


}
