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

public class Activity11 extends AppCompatActivity {


    ListView list;
    String[] stores = {
            "톤쇼우",
            "해목",
            "해운대소문난암소갈비집",
            "할매국밥",
            "포르타나",
            "비비비당",
            "블랙업커피",
            "카페덕미"
    };

    Integer[] images = {
            R.drawable.busan1,
            R.drawable.busan2,
            R.drawable.busan3,
            R.drawable.busan4,
            R.drawable.busan5,
            R.drawable.busan6,
            R.drawable.busan7,
            R.drawable.busan8
    };

    String[] address = {
            "부산광역시 수영구 광안해변로279번길 13",
            "부산광역시 해운대구 구남로24번길 8",
            "부산광역시 해운대구 중동2로10번길 32-10",
            "부산광역시 동구 중앙대로533번길 4",
            "부산광역시 해운대구 우동1로20번길 21",
            "부산광역시 해운대구 달맞이길 239-16",
            "부산광역시 부산진구 서전로10번길 41",
            "부산광역시 기장군 기장읍 동암해안길 77"

    };
    String[] numbers = {
            "051-752-7978",
            "051-746-3730",
            "051-746-0033",
            "051-646-6295",
            "051-741-1131",
            "051-746-0705",
            "051-944-4952",
            "0507-1384-5820"
    };
    String[] genre = {

            "까스 요리",
            "정통 일식/일반 일식",
            "고기 요리",
            "탕/찌개/전골",
            "기타 양식",
            "카페/디저트",
            "카페/디저트",
            "카페/디저트"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity9);

        Activity11.CustomList adapter = new Activity11.CustomList(Activity11.this);

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