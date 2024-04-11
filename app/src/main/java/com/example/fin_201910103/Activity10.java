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

public class Activity10 extends AppCompatActivity {


    ListView list;
    String[] stores = {
            "평창한우마을",
            "다키닥팜",
            "진태원",
            "황태회관",
            "유천막국수",
            "카페 연월일",
            "이화에월백하고",
            "세븐헌드레드"
    };

    Integer[] images = {
            R.drawable.gang1,
            R.drawable.gang2,
            R.drawable.gang3,
            R.drawable.gang4,
            R.drawable.gang5,
            R.drawable.gang6,
            R.drawable.gang7,
            R.drawable.gang8
    };

    String[] address = {
            "강원도 평창군 봉평면 진조길 57",
            "강원도 평창군 봉평면 금당계곡로 1731-5",
            "강원도 평창군 대관령면 횡계길 19",
            "강원도 평창군 대관령면 눈마을길 19",
            "강원도 평창군 대관령면 만과봉길 58",
            "강원도 평창군 진부면 진고개로 141-6",
            "강원도 평창군 평창읍 고길천로 859",
            "강원도 평창군 대관령면 강변길 93"

    };
    String[] numbers = {
            "033-333-9777",
            "033-333-5262",
            "033-335-5567",
            "033-335-5795",
            "033-332-6423",
            "033-332-6488",
            "033-334-8642",
            "033-333-5236"
    };
    String[] genre = {

            "고기 요리",
            "닭/오리 요리",
            "정통 중식/일반 중식",
            "탕/찌개/전골",
            "국수/면 요리",
            "카페/디저트",
            "카페/디저트",
            "카페/디저트"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity9);

        Activity10.CustomList adapter = new Activity10.CustomList(Activity10.this);

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