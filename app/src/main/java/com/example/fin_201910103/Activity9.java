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

public class Activity9 extends AppCompatActivity {

    ListView list;
    String[] stores = {
            "오는정 김밥",
            "산방식당",
            "삼성혈해물탕",
            "오조해녀의집",
            "항구식당",
            "오설록 티 뮤지엄",
            "리치망고 애월본점",
            "보엠"
    };

    Integer[] images = {
            R.drawable.jeju1,
            R.drawable.jeju2,
            R.drawable.jeju3,
            R.drawable.jeju4,
            R.drawable.jeju5,
            R.drawable.jeju6,
            R.drawable.jeju7,
            R.drawable.jeju8
    };

    String[] address = {
            "제주특별자치도 서귀포시 동문동로 2",
            "제주특별자치도 서귀포시 대정읍 하모이삼로 62",
            "제주특별자치도 제주시 선덕로5길 20",
            "제주특별자치도 서귀포시 성산읍 한도로 141-13",
            "제주특별자치도 서귀포시 대정읍 하모항구로 64",
            "제주특별자치도 서귀포시 안덕면 신화역사로 15",
            "제주특별자치도 제주시 애월읍 애월해안로 272",
            "제주특별자치도 제주시 원노형로 102"

    };
    String[] numbers = {
            "064-762-8927",
            "064-794-2165",
            "064-745-3000",
            "064-784-7789",
            "064-794-2254",
            "064-794-5312",
            "070-4243-5959",
            "064-711-9990"
    };
    String[] genre = {
            "기타 한식",
            "국수/면 요리",
            "해산물 요리",
            "해산물 요리",
            "한식",
            "카페/디저트",
            "카페/디저트",
            "베이커리"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity9);

        CustomList adapter = new CustomList(Activity9.this);

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
