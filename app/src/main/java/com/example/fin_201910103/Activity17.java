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

public class Activity17 extends AppCompatActivity {


    ListView list;
    String[] stores = {
            "어느날의오후",
            "전망",
            "맘앤타르트",
            "마시랑게",
            "유히스",
            "카페홍시궁",
            "더폴",
            "맘스브레드"
    };

    Integer[] images = {
            R.drawable.jeonju1,
            R.drawable.jeonju2,
            R.drawable.jeonju3,
            R.drawable.jeonju4,
            R.drawable.jeonju5,
            R.drawable.jeonju6,
            R.drawable.jeonju7,
            R.drawable.jeonju8
    };

    String[] address = {
            "전라북도 전주시 덕진구 명륜1길 14-8",
            "전라북도 전주시 완산구 한지길 89",
            "전라북도 전주시 완산구 전동성당길 100 1F",
            "전라북도 전주시 완산구 전동성당길 100 2F",
            "전라북도 전주시 덕진구 권삼득로 239",
            "전라북도 전주시 완산구 전주객사1길 94",
            "전라북도 전주시 덕진구 오송1길 37-13",
            "전라북도 전주시 완산구 호암로 81 은하빌딩"

    };
    String[] numbers = {
            "010-7180-3450",
            "063-232-6106",
            "063-232-9582",
            "0507-1460-0235",
            "번호 정보 없음",
            "063-282-2014",
            "070-7723-0976",
            "063-225-1108"
    };
    String[] genre = {
            "카페/디저트",
            "카페/디저트",
            "베이커리",
            "카페/디저트",
            "카페/디저트",
            "카페/디저트",
            "베이커리",
            "베이커리"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity9);

        Activity17.CustomList adapter = new Activity17.CustomList(Activity17.this);

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