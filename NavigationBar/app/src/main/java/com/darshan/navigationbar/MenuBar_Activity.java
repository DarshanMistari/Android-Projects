package com.darshan.navigationbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MenuBar_Activity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageButton menuBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menubar_layout);

        drawerLayout = findViewById(R.id.drawerLayout);
        menuBtn = findViewById(R.id.menuBtn);

        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.open();
            }
        });

    }
}
