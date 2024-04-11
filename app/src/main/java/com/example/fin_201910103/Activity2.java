package com.example.fin_201910103;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    String result1, result2, result3, result4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        Button b10 = (Button)findViewById(R.id.button10);
        ImageButton ib1 = (ImageButton)findViewById(R.id.imageButton1);
        ImageButton ib2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton ib3 = (ImageButton)findViewById(R.id.imageButton3);
        ImageButton ib4 = (ImageButton)findViewById(R.id.imageButton4);

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result1 = "힐링 여행";

                Intent in = new Intent(Activity2.this, Activity3.class);
                in.putExtra("HEALING", result1);
                startActivityForResult(in, 1);
            }
        });

        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result2 = "액티비티 여행";

                Intent in = new Intent(Activity2.this, Activity4.class);
                in.putExtra("ACTIVITY", result2);
                startActivityForResult(in, 1);
            }
        });

        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result3 = "식도락 여행";

                Intent in = new Intent(Activity2.this, Activity5.class);
                in.putExtra("FOOD", result3);
                startActivityForResult(in, 1);
            }
        });

        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result4 = "역사 여행";

                Intent in = new Intent(Activity2.this, Activity6.class);
                in.putExtra("HISTORY", result4);
                startActivityForResult(in, 1);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { finish(); }
        });
    }
}
