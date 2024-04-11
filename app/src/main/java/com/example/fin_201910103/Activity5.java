package com.example.fin_201910103;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity5 extends AppCompatActivity {

    String result1, result2, result3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity5);

        TextView tv12 = (TextView)findViewById(R.id.textView9);

        RadioButton rb7 = (RadioButton)findViewById(R.id.radioButton10);
        RadioButton rb8 = (RadioButton)findViewById(R.id.radioButton11);
        RadioButton rb9 = (RadioButton)findViewById(R.id.radioButton12);

        Button b7 = (Button)findViewById(R.id.button3);
        Button b8 = (Button)findViewById(R.id.button6);

        Intent in = getIntent();

        tv12.setText("" + in.getStringExtra("FOOD"));

        b7.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if(rb7.isChecked() == true) {
                    result1 = rb7.getText().toString();
                    result2 = "1. 제스티살룬(양식)\n2. 난포(퓨전한식)\n3. 탐광(일식)\n";
                    result3 = "seoul";
                } else if(rb8.isChecked() == true) {
                    result1 = rb8.getText().toString();
                    result2 = "1. 꽃돌게장 1번가(한정식/백반)\n2. 월성소주코너(해산물)\n3. 진미꽃게탕(해산물)";
                    result3 = "yeosu";
                } else {
                    result1 = rb9.getText().toString();
                    result2 = "1. 자매갈비전골(고기요리)\n2. 메르밀진미집(국수/면요리)\n3. 백수의 찬(일식)";
                    result3 = "jeonju";
                }
                Intent in = new Intent(Activity5.this, Activity7.class);
                in.putExtra("PLACE", result1);
                in.putExtra("PLACE2", result2);
                in.putExtra("PLACE3", result3);
                startActivityForResult(in, 1);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) { finish(); }
        });
    }
}
