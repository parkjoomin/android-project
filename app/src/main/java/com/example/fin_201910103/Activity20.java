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

public class Activity20 extends AppCompatActivity {

    ListView list;
    String[] stores = {
            "서령",
            "충남서산집",
            "토가",
            "미리내바지락칼국수",
            "보광호",
            "드리우니",
            "토크라피",
            "핀오크카페"
    };

    Integer[] images = {
            R.drawable.ganghwa1,
            R.drawable.ganghwa2,
            R.drawable.ganghwa3,
            R.drawable.ganghwa4,
            R.drawable.ganghwa5,
            R.drawable.ganghwa6,
            R.drawable.ganghwa7,
            R.drawable.ganghwa8
    };

    String[] address = {
            "인천광역시 강화군 길상면 보리고개로 96",
            "인천광역시 강화군 내가면 중앙로 1200",
            "인천광역시 강화군 화도면 해안남로 1912",
            "인천광역시 강화군 길상면 전등사로 42",
            "인천광역시 강화군 길상면 해안남로619번길 21",
            "인천광역시 강화군 길상면 마니산로 106",
            "인천광역시 강화군 화도면 해안남로1691번길 43-12",
            "인천광역시 강화군 길상면 장흥로 185-9"
    };
    String[] numbers = {
            "032-937-8774",
            "032-933-8403",
            "032-937-4482",
            "032-933-2480",
            "032-937-7111",
            "0507-1334-0985",
            "070-7607-1691",
            "032-937-5159"
    };
    String[] genre = {
            "국수/면 요리",
            "해산물 요리",
            "탕/찌개/전골",
            "국수/면 요리",
            "해산물 요리",
            "카페/디저트",
            "카페/디저트",
            "카페/디저트"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity9);

        Activity20.CustomList adapter = new Activity20.CustomList(Activity20.this);

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