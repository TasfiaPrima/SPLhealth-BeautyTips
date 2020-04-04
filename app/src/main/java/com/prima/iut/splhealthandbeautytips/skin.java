package com.prima.iut.splhealthandbeautytips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class skin extends AppCompatActivity {
    private Button BtnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin);

        BtnMove = findViewById(R.id.button31);
        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity31();

            }
        });
        BtnMove = findViewById(R.id.button32);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity32();

            }
        });
        BtnMove = findViewById(R.id.button33);

        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToActivity33();

            }
        });

    }

    private void moveToActivity31() {
        Intent intent = new Intent(skin.this, drySkin.class);
        startActivity(intent);

    }

    private void moveToActivity32() {
        Intent intent = new Intent(skin.this, oilySkin.class);
        startActivity(intent);

    }

    private void moveToActivity33() {
        Intent intent = new Intent(skin.this, sensitiveSkin.class);
        startActivity(intent);

    }
}

