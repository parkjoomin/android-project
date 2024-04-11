package com.example.fin_201910103;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity7 extends AppCompatActivity {

    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity7);

        TextView tv16 = (TextView)findViewById(R.id.textView16);
        TextView tv15 = (TextView)findViewById(R.id.textView15);

        ImageView iv = (ImageView)findViewById(R.id.imageView);

        Button b9 = (Button)findViewById(R.id.button9);
        Button b11 = (Button)findViewById(R.id.button11);
        Button b12 = (Button)findViewById(R.id.button12);

        Intent in = getIntent();
        tv16.setText("" + in.getStringExtra("PLACE"));
        tv15.setText("" + in.getStringExtra("PLACE2"));

        str = in.getStringExtra("PLACE3");
        if(str.equals("jeju")) {
            iv.setImageResource(R.drawable.jeju);
        } else if(str.equals("gangwon")) {
            iv.setImageResource(R.drawable.gangwon);
        } else if(str.equals("busan")) {
            iv.setImageResource(R.drawable.busan);
        } else if(str.equals("tong")) {
            iv.setImageResource(R.drawable.tong);
        } else if(str.equals("yangyang")) {
            iv.setImageResource(R.drawable.yangyang);
        } else if(str.equals("danyang")) {
            iv.setImageResource(R.drawable.danyang);
        } else if(str.equals("seoul")) {
            iv.setImageResource(R.drawable.seoul);
        } else if(str.equals("yeosu")) {
            iv.setImageResource(R.drawable.yeosu);
        } else if(str.equals("jeonju")) {
            iv.setImageResource(R.drawable.jeonju);
        } else if(str.equals("gyeongju")) {
            iv.setImageResource(R.drawable.gyeongju);
        } else if(str.equals("buyeo")) {
            iv.setImageResource(R.drawable.buyeo);
        } else {
            iv.setImageResource(R.drawable.ganghwa);
        }

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Activity7.this, Activity8.class);
                startActivity(in);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = getIntent();

                str = in.getStringExtra("PLACE3");
                if(str.equals("jeju")) {
                    in = new Intent(Activity7.this, Activity9.class);
                    startActivity(in);
                } else if(str.equals("gangwon")) {
                    in = new Intent(Activity7.this, Activity10.class);
                    startActivity(in);
                } else if(str.equals("busan")) {
                    in = new Intent(Activity7.this, Activity11.class);
                    startActivity(in);
                } else if(str.equals("yangyang")) {
                    in = new Intent(Activity7.this, Activity12.class);
                    startActivity(in);
                } else if(str.equals("danyang")) {
                    in = new Intent(Activity7.this, Activity13.class);
                    startActivity(in);
                } else if(str.equals("tong")) {
                    in = new Intent(Activity7.this, Activity14.class);
                    startActivity(in);
                } else if(str.equals("seoul")) {
                    in = new Intent(Activity7.this, Activity15.class);
                    startActivity(in);
                } else if(str.equals("yeosu")) {
                    in = new Intent(Activity7.this, Activity16.class);
                    startActivity(in);
                } else if(str.equals("jeonju")) {
                    in = new Intent(Activity7.this, Activity17.class);
                    startActivity(in);
                } else if(str.equals("gyeongju")) {
                    in = new Intent(Activity7.this, Activity18.class);
                    startActivity(in);
                } else if(str.equals("buyeo")) {
                    in = new Intent(Activity7.this, Activity19.class);
                    startActivity(in);
                } else {
                    in = new Intent(Activity7.this, Activity20.class);
                    startActivity(in);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mapmenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent in = getIntent();

        str = in.getStringExtra("PLACE3");
        if(str.equals("jeju")) {
            in = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:33.57822435,126.5730296?z=12"));
        } else if(str.equals("gangwon")) {
            in = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.54352255,128.5039785?z=12"));
        } else if(str.equals("busan")) {
            in = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:35.1644499,129.07179986?z=12"));
        } else if(str.equals("tong")) {
            in = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:34.85605001,128.41875003?z=12"));
        } else if(str.equals("yangyang")) {
            in = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:38.03486975,128.6442859?z=12"));
        } else if(str.equals("danyang")) {
            in = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:36.97988985,128.4369766?z=12"));
        } else if(str.equals("seoul")) {
            in = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.55087675,127.04089515?z=12"));
        } else if(str.equals("yeosu")) {
            in = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:34.7525,127.69185?z=12"));
        } else if(str.equals("jeonju")) {
            in = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:35.8255,127.1316?z=12"));
        } else if(str.equals("gyeongju")) {
            in = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:35.8534,129.20435?z=12"));
        } else if(str.equals("buyeo")) {
            in = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:36.2286792,126.87588098?z=12"));
        } else {
            in = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.70496502,126.24850694?z=12"));
        }

        if(in != null) {
            startActivity(in);
        }

        return super.onOptionsItemSelected(item);
    }

}
