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

public class Activity19 extends AppCompatActivity {


    ListView list;
    String[] stores = {
            "장원막국수",
            "시골통닭",
            "연꽃향",
            "솔내음레스토랑",
            "구드래돌쌈밥",
            "커피202",
            "무드빌리지",
            "사바랭"
    };

    Integer[] images = {
            R.drawable.buyeo1,
            R.drawable.buyeo2,
            R.drawable.buyeo3,
            R.drawable.buyeo4,
            R.drawable.buyeo5,
            R.drawable.buyeo6,
            R.drawable.buyeo7,
            R.drawable.buyeo8
    };

    String[] address = {
            "충청남도 부여군 부여읍 나루터로62번길 20",
            "충청남도 부여군 부여읍 중앙로5번길 14-9",
            "충청남도 부여군 부여읍 궁남로 25",
            "충청남도 부여군 부여읍 나루터로 39",
            "충청남도 부여군 부여읍 나루터로 31",
            "충청남도 부여군 규암면 자온로 74",
            "충청남도 부여군 부여읍 뒷개로27번길 10-1 2F",
            "충청남도 부여군 부여읍 서동로 85"
    };
    String[] numbers = {
            "041-835-6561",
            "041-835-3522",
            "041-837-0007",
            "041-836-0116",
            "041-836-9259",
            "041-833-3202",
            "041-832-3982",
            "041-834-1026"
    };
    String[] genre = {
            "국수/면 요리",
            "닭/오리 요리",
            "한정식/백반/정통 한식",
            "한정식/백반/정통 한식",
            "한정식/백반/정통 한식",
            "카페/디저트",
            "카페/디저트",
            "카페/디저트"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity9);

        Activity19.CustomList adapter = new Activity19.CustomList(Activity19.this);

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