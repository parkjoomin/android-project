package com.example.fin_201910103;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity4 extends AppCompatActivity {
    String result1, result2, result3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);

        TextView tv7 = (TextView)findViewById(R.id.textView9);

        RadioButton rb4 = (RadioButton)findViewById(R.id.radioButton10);
        RadioButton rb5 = (RadioButton)findViewById(R.id.radioButton11);
        RadioButton rb6 = (RadioButton)findViewById(R.id.radioButton12);

        Button b = (Button)findViewById(R.id.button3);
        Button b2 = (Button)findViewById(R.id.button6);

        Intent in = getIntent();

        tv7.setText("" + in.getStringExtra("ACTIVITY"));

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rb4.isChecked() == true) {
                    result1 = rb4.getText().toString();
                    result2 = "1. 죽도 해수욕장(서핑)\n2. 해담마을휴양지(수륙양용차)\n3. 광나루해변(스노쿨링)";
                    result3 = "yangyang";
                } else if(rb5.isChecked() == true) {
                    result1 = rb5.getText().toString();
                    result2 = "1. 만천하스카이워크(짚라인, 알파인코스터, 슬라이딩)\n2. 패러에 반하다(패러글라이딩)\n3. 남한강레포츠(래프팅)";
                    result3 = "danyang";
                } else {
                    result1 = rb6.getText().toString();
                    result2 = "1. 스카이라인루지 통영(루지)\n2. 소매물도 트레킹(트레킹)\n3. 통영 어드벤처타워(어드벤처)\n";
                    result3 = "tong";
                }
                Intent in = new Intent(Activity4.this, Activity7.class);
                in.putExtra("PLACE", result1);
                in.putExtra("PLACE2", result2);
                in.putExtra("PLACE3", result3);
                startActivityForResult(in, 1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) { finish(); }
        });
    }
}
