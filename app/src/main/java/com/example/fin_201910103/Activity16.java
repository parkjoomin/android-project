package com.example.fin_201910103;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity16 extends AppCompatActivity {


    ListView list;
    String[] stores = {
            "카페드몽돌",
            "카페라피끄",
            "리트커피",
            "여수당",
            "와이드 커피 스탠드",
            "싱글벙글빵집",
            "거북선빵",
            "카페바림"
    };

    Integer[] images = {
            R.drawable.yeosu1,
            R.drawable.yeosu2,
            R.drawable.yeosu3,
            R.drawable.yeosu4,
            R.drawable.yeosu5,
            R.drawable.yeosu6,
            R.drawable.yeosu7,
            R.drawable.yeosu8
    };

    String[] address = {
            "전라남도 여수시 돌산읍 계동로 552",
            "전라남도 여수시 돌산읍 무술목길 142-1",
            "전라남도 여수시 신월로 112",
            "전라남도 여수시 중앙로 72",
            "전라남도 여수시 고소3길 64",
            "전라남도 여수시 관문1길 13-1",
            "전라남도 여수시 중앙로 68-1",
            "전라남도 여수시 웅남1길 6-16"

    };
    String[] numbers = {
            "061-644-7775",
            "061-924-1004",
            "010-2965-1121",
            "061-661-0222",
            "010-3368-8935",
            "061-663-8797",
            "061-666-9997",
            "061-684-8534"
    };
    String[] genre = {
            "브런치/버거/샌드위치",
            "카페/디저트",
            "카페/디저트",
            "카페/디저트",
            "카페/디저트",
            "베이커리",
            "베이커리",
            "카페/디저트"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity9);

        Activity16.CustomList adapter = new Activity16.CustomList(Activity16.this);

        list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

    }

    public class CustomList extends ArrayAdapter<String> {
        private final Activity context;

        public CustomList(Activity context) {
            super(context, R.layout.listitem, stores);
            this.context = context;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater = context.getLayoutInflater();
            View rowView = inflater.inflate(R.layout.listitem, null, true);

            ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
            TextView store = (TextView) rowView.findViewById(R.id.stores);
            TextView addresss = (TextView) rowView.findViewById(R.id.address);
            TextView number = (TextView) rowView.findViewById(R.id.numbers);
            TextView genree = (TextView) rowView.findViewById(R.id.genre);

            store.setText(stores[position]);
            imageView.setImageResource(images[position]);
            addresss.setText(address[position]);
            number.setText(numbers[position]);
            genree.setText(genre[position]);

            return rowView;
        }
    }

}