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

public class Activity15 extends AppCompatActivity {


    ListView list;
    String[] stores = {
            "프롤라",
            "로우커피스탠드",
            "새들러하우스",
            "맛차차",
            "밀도",
            "성수베이킹스튜디오",
            "먼치스앤구디스",
            "온더"
    };

    Integer[] images = {
            R.drawable.seoul1,
            R.drawable.seoul2,
            R.drawable.seoul3,
            R.drawable.seoul4,
            R.drawable.seoul5,
            R.drawable.seoul6,
            R.drawable.seoul7,
            R.drawable.seoul8
    };

    String[] address = {
            "서울특별시 성동구 연무장17길 5 1F",
            "서울특별시 성동구 왕십리로4길 28-2 1F",
            "서울특별시 성동구 성덕정11길 5-12",
            "서울특별시 성동구 서울숲2길 18-11 1F",
            "서울특별시 성동구 왕십리로 96",
            "서울특별시 성동구 서울숲2길 46 B1",
            "서울특별시 성동구 연무장길 33 1F",
            "서울특별시 성동구 왕십리로14길 23 1F"

    };
    String[] numbers = {
            "0507-1354-9616",
            "0507-1334-3343",
            "02-3212-1231",
            "010-9719-8707",
            "02-497-5050",
            "02-468-0789",
            "070-4105-2880",
            "055-646-1414"
    };
    String[] genre = {
            "카페/디저트",
            "카페/디저트",
            "카페/디저트",
            "카페/디저트",
            "베이커리",
            "베이커리",
            "베이커리",
            "베이커리"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity9);

        Activity15.CustomList adapter = new Activity15.CustomList(Activity15.this);

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