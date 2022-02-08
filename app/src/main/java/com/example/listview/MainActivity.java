package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] androidVersions={"Cup Cake","Donut","Eclair","Froyo","Honeycomb","Ice Cream Sandwich","Jelly Bean","KitKat","Lollipop","Marshmallow","Nougat" };
    Integer[] images={R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,R.drawable.froyo,R.drawable.honeycomb,R.drawable.icecreamsandwitch,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop,R.drawable.marshmallow,R.drawable.nougat};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.LV_list);
        ArrayAdapter adapter= new ArrayAdapter();
        listView.setAdapter(adapter);

    }
    class ArrayAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            View view1=getLayoutInflater().inflate(R.layout.row, null);
            TextView textView=view1.findViewById(R.id.textview);
            ImageView imageView=view1.findViewById(R.id.imageview);

            imageView.setImageResource(images[position]);
            textView.setText(androidVersions[position]);

            return view1;
        }
    }
}