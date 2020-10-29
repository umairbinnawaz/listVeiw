package com.example.arraylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] mobileArrye={"Android","IPHONE","Window 10","window 11","window xp","window 96","window 10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter =new ArrayAdapter(MainActivity.this,R.layout.layout,R.id.textview,mobileArrye);
        ListView listView=findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}