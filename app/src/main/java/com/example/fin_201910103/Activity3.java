package com.example.fin_201910103;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    String result1, result2, result3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);


        TextView tv4 = (TextView)findViewById(R.id.textView9);

        RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton10);
        RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton11);
        RadioButton rb3 = (RadioButton)findViewById(R.id.radioButton12);

        Button b4 = (Button)findViewById(R.id.button6);
        Button b5 = (Button)findViewById(R.id.button3);

        Intent in = getIntent();

        tv4.setText("" + in.getStringExtra("HEALING"));


        b5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if(rb1.isChecked() == true) {
                    result1 = rb1.getText().toString();
                    result2 = "1. 사려니숲길\n2. 섭지코지\n3. 빛의 벙커\n";
                    result3 = "jeju";
                } else if(rb2.isChecked() == true) {
                    result1 = rb2.getText().toString();
                    result2 = "1. 발왕산 기 스카이워크\n2. 대관령 양떼목장\n3. 국립한국자생식물원";
                    result3 = "gangwon";
                } else {
                    result1 = rb3.getText().toString();
                    result2 = "1. 해운대 블루라인파크\n2. 감천 문화마을\n3. 부산 엑스더스카이";
                    result3 = "busan";
                }
                Intent in = new Intent(Activity3.this, Activity7.class);
                in.putExtra("PLACE", result1);
                in.putExtra("PLACE2", result2);
                in.putExtra("PLACE3", result3);
                startActivityForResult(in, 1);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) { finish(); }
        });
    }
}