package com.darshan.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Menu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        Button btnAdd =findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iAdd = new Intent(Menu_Activity.this,Addition_Activity.class);
                startActivity(iAdd);
            }
        });

        Button btnSub = findViewById(R.id.btnSub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iSub = new Intent(Menu_Activity.this,Subtraction_Activity.class);
                startActivity(iSub);
            }
        });

        Button btnMul = findViewById(R.id.btnMul);
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMul = new Intent(Menu_Activity.this,Multiplication_Activity.class);
                startActivity(iMul);
            }

        });

    }
    public void btnDiv(View view)
    {
        Intent iDiv = new Intent(Menu_Activity.this,Division_Activity.class);
        startActivity(iDiv);
    }

}
