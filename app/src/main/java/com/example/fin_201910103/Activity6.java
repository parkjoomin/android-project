package com.example.fin_201910103;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity6 extends AppCompatActivity {

    String result1, result2, result3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity6);

        TextView tv9 = (TextView)findViewById(R.id.textView9);

        RadioButton rb10 = (RadioButton)findViewById(R.id.radioButton10);
        RadioButton rb11 = (RadioButton)findViewById(R.id.radioButton11);
        RadioButton rb12 = (RadioButton)findViewById(R.id.radioButton12);

        Button b3 = (Button)findViewById(R.id.button3);
        Button b6 = (Button)findViewById(R.id.button6);

        Intent in = getIntent();

        tv9.setText("" + in.getStringExtra("HISTORY"));

        b3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if(rb10.isChecked() == true) {
                    result1 = rb10.getText().toString();
                    result2 = "1. 첨성대\n2. 국립경주박물관\n3. 불국사\n";
                    result3 = "gyeongju";
                } else if(rb11.isChecked() == true) {
                    result1 = rb11.getText().toString();
                    result2 = "1. 사비궁\n2. 위례성\n3. 백제역사문화관";
                    result3 = "buyeo";
                } else {
                    result1 = rb12.getText().toString();
                    result2 = "1. 강화외성\n2. 고려궁지\n3. 선원사";
                    result3 = "ganghwa";
                }
                Intent in = new Intent(Activity6.this, Activity7.class);
                in.putExtra("PLACE", result1);
                in.putExtra("PLACE2", result2);
                in.putExtra("PLACE3", result3);
                startActivityForResult(in, 1);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) { finish(); }
        });
    }
}