package com.example.lt_day10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView lvColor;//adapterview
    private String[] colors = new String[]{"red", "Green", "Blue", "Yellow", "Black", "Pink"}; //data

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvColor = findViewById(R.id.lv_color);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,colors);
        lvColor.setAdapter(adapter);
    }
}