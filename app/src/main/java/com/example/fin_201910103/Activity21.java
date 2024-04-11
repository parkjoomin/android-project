package com.example.fin_201910103;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity21 extends AppCompatActivity {

    int m1, m2, m3, money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity10);

        TextView tv3 = (TextView)findViewById(R.id.textView3);

        Intent intent = getIntent();
        m1 = intent.getIntExtra("m1", 0);
        m2 = intent.getIntExtra("m2", 0);
        m3 = intent.getIntExtra("m3", 0);

        money = (m1 + m2) * m3;

        tv3.setText("총 경비는 대략 " + money + "원 입니다.");

        Button b2 = (Button)findViewById(R.id.button2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Activity21.this, Activity1.class);
                startActivity(it);
            }
        });
    }
}
