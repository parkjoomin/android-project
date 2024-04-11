package com.example.fin_201910103;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity8 extends AppCompatActivity {
    static final int GET_RESULT = 1;
    TextView textView18, textView24, textView25;

    int money = 0, m1 = 0, m2 = 0, m3 = 0; //m1은 비행기/기차표, m2는 월별 추가요금, m3는 인원수
    int data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity8);

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        textView18 = (TextView) findViewById(R.id.textView18);

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        textView24 = (TextView) findViewById(R.id.textView24);

        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        textView25 = (TextView) findViewById(R.id.textView25);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.travel_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Toast.makeText(parent.getContext(), "선택된 여행지 : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
                //textView.setText(items[pos]);


                String selectedItemName = spinner.getSelectedItem().toString();
                if (selectedItemName.equals("제주도")) {
                    m1 = 80000;
                } else if(selectedItemName.equals("강원도 평창")) {
                    m1 = 8500;
                } else if(selectedItemName.equals("부산광역시")) {
                    m1 = 54000;
                } else if(selectedItemName.equals("강원도 양양")) {
                    m1 = 20000;
                } else if(selectedItemName.equals("충청북도 단양")) {
                    m1 = 17000;
                } else if(selectedItemName.equals("경상남도 통영")) {
                    m1 = 30000;
                } else if(selectedItemName.equals("서울특별시")) {
                    m1 = 8500;
                } else if(selectedItemName.equals("전라남도 여수")) {
                    m1 = 40000;
                } else if(selectedItemName.equals("전라북도 전주")) {
                    m1 = 32000;
                } else if(selectedItemName.equals("경상북도 경주")) {
                    m1 = 48000;
                } else if(selectedItemName.equals("충청남도 부여")) {
                    m1 = 20000;
                } else {
                    m1 = 7000;
                }
            }

            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.travel_array2, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Toast.makeText(parent.getContext(), "선택된 달 : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();

                String selectedItemName = spinner2.getSelectedItem().toString();
                if (selectedItemName.equals("2022년 6월")) {
                    m2 = 0;
                } else if(selectedItemName.equals("2022년 7월")) {
                    m2 = m1/4;
                } else if(selectedItemName.equals("2022년 8월")) {
                    m2 = m1/8*5;
                } else if(selectedItemName.equals("2022년 9월")) {
                    m2 = 0;
                } else if(selectedItemName.equals("2022년 10월")) {
                    m2 = m1/4;
                } else if(selectedItemName.equals("2022년 11월")) {
                    m2 = m1/2;
                } else {
                    m2 = m1/2;
                }
            }

            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.travel_array3, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Toast.makeText(parent.getContext(), "선택된 인원수 : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();

                String selectedItemName = spinner3.getSelectedItem().toString();
                if (selectedItemName.equals("1명")) {
                    m3 = 1;
                } else if(selectedItemName.equals("2명")) {
                    m3 = 2;
                } else if(selectedItemName.equals("3명")) {
                    m3 = 3;
                } else if(selectedItemName.equals("4명")) {
                    m3 = 4;
                } else if(selectedItemName.equals("5명")) {
                    m3 = 5;
                } else if(selectedItemName.equals("6명")) {
                    m3 = 6;
                } else if(selectedItemName.equals("7명")) {
                    m3 = 7;
                } else if(selectedItemName.equals("8명")) {
                    m3 = 8;
                } else if(selectedItemName.equals("9명")) {
                    m3 = 9;
                } else {
                    m3 = 10;
                }

            }

            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        Button b = (Button) findViewById(R.id.button);
        
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity8.this, Activity21.class);
                in.putExtra("m1", m1);
                in.putExtra("m2", m2);
                in.putExtra("m3", m3);
                startActivityForResult(in, GET_RESULT);
            }
        });
    }

}