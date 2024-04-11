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

public class Activity14 extends AppCompatActivity {


    ListView list;
    String[] stores = {
            "장어잡는날",
            "훈이시락국",
            "심가네 해물짬뽕",
            "한일김밥",
            "만성복집",
            "통영오미사꿀빵",
            "미스티크",
            "클라우드힐"
    };

    Integer[] images = {
            R.drawable.tong1,
            R.drawable.tong2,
            R.drawable.tong3,
            R.drawable.tong4,
            R.drawable.tong5,
            R.drawable.tong6,
            R.drawable.tong7,
            R.drawable.tong8
    };

    String[] address = {
            "경상남도 통영시 도천상가안길 50 영생상가 2F",
            "경상남도 통영시 새터길 42-7",
            "경상남도 통영시 새터길 74-4",
            "경상남도 통영시 통영해안로 319",
            "경상남도 통영시 새터길 12-13",
            "경상남도 통영시 도남로 110",
            "경상남도 통영시 산양읍 산양일주로 1215-52 1F",
            "경상남도 통영시 산양읍 산양일주로 71"

    };
    String[] numbers = {
            "055-643-2758",
            "055-649-6417",
            "055-649-8215",
            "055-645-2647",
            "055-645-2140",
            "055-646-3230",
            "055-646-9046",
            "055-646-1414"
    };
    String[] genre = {
            "해산물 요리",
            "탕/찌개/전골",
            "정통 중식/일반 중식",
            "기타 한식",
            "해산물 요리",
            "카페/디저트",
            "카페/디저트",
            "카페/디저트"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity9);

        Activity14.CustomList adapter = new Activity14.CustomList(Activity14.this);

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