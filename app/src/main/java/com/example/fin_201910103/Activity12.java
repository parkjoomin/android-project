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

public class Activity12 extends AppCompatActivity {


    ListView list;
    String[] stores = {
            "영광정 메밀국수",
            "송이버섯마을",
            "공가네감자옹심이",
            "산촌생등심",
            "범부메밀국수",
            "바다뷰제빵소",
            "어느멋진날카페",
            "페이보릿"
    };

    Integer[] images = {
            R.drawable.yangyang1,
            R.drawable.yangyang2,
            R.drawable.yangyang3,
            R.drawable.yangyang4,
            R.drawable.yangyang5,
            R.drawable.yangyang6,
            R.drawable.yangyang7,
            R.drawable.yangyang8
    };

    String[] address = {
            "강원도 양양군 강현면 진미로 446",
            "강원도 양양군 양양읍 안산1길 74-52",
            "강원도 양양군 양양읍 남문5길 5-17",
            "강원도 양양군 강현면 안골로 58",
            "강원도 양양군 서면 고인돌길 6",
            "강원도 양양군 강현면 동해대로 3294",
            "강원도 양양군 강현면 동해대로 3373",
            "강원도 양양군 현남면 인구길 38"

    };
    String[] numbers = {
            "033-673-5254",
            "033-672-3145",
            "033-671-3605",
            "033-673-6408",
            "033-671-0743",
            "033-671-8899",
            "010-7730-6809",
            "0507-1495-5607"
    };
    String[] genre = {

            "국수/면 요리",
            "탕/찌개/전골",
            "국수/면 요리",
            "고기 요리",
            "국수/면 요리",
            "베이커리",
            "카페/디저트",
            "카페/디저트"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity9);

        Activity12.CustomList adapter = new Activity12.CustomList(Activity12.this);

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