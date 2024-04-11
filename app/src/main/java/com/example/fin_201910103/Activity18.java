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

public class Activity18 extends AppCompatActivity {


    ListView list;
    String[] stores = {
            "아니마",
            "영양숯불갈비",
            "료코",
            "기와메밀막국수",
            "향화정",
            "황남빵",
            "스컹크웍스",
            "빛꾸리"
    };

    Integer[] images = {
            R.drawable.gyeongju1,
            R.drawable.gyeongju2,
            R.drawable.gyeongju3,
            R.drawable.gyeongju4,
            R.drawable.gyeongju5,
            R.drawable.gyeongju6,
            R.drawable.gyeongju7,
            R.drawable.gyeongju8
    };

    String[] address = {
            "경상북도 경주시 포석로1050번길 51",
            "경상북도 경주시 봉황로 79",
            "경상북도 경주시 첨성로99번길 27",
            "경상북도 경주시 분황로 91",
            "경상북도 경주시 사정로57번길 17",
            "경상북도 경주시 태종로 783",
            "경상북도 경주시 포석로 1058-3",
            "경상북도 경주시 손효자길 16-1"
    };
    String[] numbers = {
            "054-773-7328",
            "054-771-2626",
            "054-773-7477",
            "054-742-4477",
            "010-7335-9723",
            "054-749-7000",
            "054-746-9300",
            "054-777-4421"
    };
    String[] genre = {
            "이탈리안",
            "고기 요리",
            "까스 요리",
            "국수/면 요리",
            "고기 요리",
            "베이커리",
            "카페/디저트",
            "카페/디저트"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity9);

        Activity18.CustomList adapter = new Activity18.CustomList(Activity18.this);

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