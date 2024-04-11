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

public class Activity13 extends AppCompatActivity {


    ListView list;
    String[] stores = {
            "가연",
            "단양마늘만두",
            "향미식당",
            "가마골쉼터",
            "카페산",
            "도깨비카페",
            "카페다우리",
            "빨간지붕"
    };

    Integer[] images = {
            R.drawable.danyang1,
            R.drawable.danyang2,
            R.drawable.danyang3,
            R.drawable.danyang4,
            R.drawable.danyang5,
            R.drawable.danyang6,
            R.drawable.danyang7,
            R.drawable.danyang8
    };

    String[] address = {
            "충청북도 단양군 단양읍 삼봉로 87",
            "충청북도 단양군 단양읍 도전4길 26",
            "충청북도 단양군 매포읍 평동4길 5",
            "충청북도 단양군 가곡면 새밭로 547-8",
            "충청북도 단양군 가곡면 두산길 196-86 1F",
            "충청북도 단양군 가곡면 두산길 254-6",
            "충청북도 단양군 대강면 선암계곡로 165",
            "충청북도 단양군 단양읍 삼봉로 324"

    };
    String[] numbers = {
            "043-421-4805",
            "043-423-0955",
            "043-422-4188",
            "010-8714-8289",
            "0507-1353-0868",
            "010-4633-3326",
            "010-6516-9090",
            "043-423-4567"
    };
    String[] genre = {

            "한정식/백반/정통 한식",
            "한정식/백반/정통 한식",
            "정통 중식/일반 중식",
            "국수/면 요리",
            "카페/디저트",
            "카페/디저트",
            "카페/디저트",
            "카페/디저트"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity9);

        Activity13.CustomList adapter = new Activity13.CustomList(Activity13.this);

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