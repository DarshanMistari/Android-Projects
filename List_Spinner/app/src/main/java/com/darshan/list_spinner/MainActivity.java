package com.darshan.list_spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinnerLst = findViewById(R.id.spinnerLst);

        ArrayList<String> nameLst = new ArrayList<>();
        nameLst.add("Darshan");
        nameLst.add("Kunal");
        nameLst.add("Ritesh");
        nameLst.add("Umesh");
        nameLst.add("Jayesh");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,nameLst);
        spinnerLst.setAdapter(adapter);

        ListView contactLst = findViewById(R.id.contactLst);
        contactLst.setAdapter(adapter);


        spinnerLst.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Item Click "+nameLst.get(i),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        contactLst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this,"Item Click "+nameLst.get(i),Toast.LENGTH_SHORT).show();
            }
        });







    }
}