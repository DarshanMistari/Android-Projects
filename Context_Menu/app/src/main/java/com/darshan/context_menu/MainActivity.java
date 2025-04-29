package com.darshan.context_menu;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        registerForContextMenu(textView);
    }


    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v , menuInfo);
        menu.setHeaderTitle("Choose a Color");
        menu.add(0,v.getId(),0,"Red");
        menu.add(0,v.getId(),0,"Green");
        menu.add(0,v.getId(),0,"Blue");
    }

    public boolean onContextItemSelected(MenuItem item){
        switch (item.getTitle().toString()){
            case "Red":
                textView.setBackgroundColor(Color.RED);
                break;
            case "Green":
                textView.setBackgroundColor(Color.GREEN);
                break;
            case "Blue":
                textView.setBackgroundColor(Color.BLUE);
                break;
        }
        return true;
    }
}