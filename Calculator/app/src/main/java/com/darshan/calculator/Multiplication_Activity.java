package com.darshan.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Multiplication_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplication_layout);

        EditText firstNum = findViewById(R.id.firstNum);
        EditText secondNum = findViewById(R.id.secondNum);
        Button btnMul = findViewById(R.id.btnMul);
        TextView txtResult = findViewById(R.id.txtResult);

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(firstNum.getText().toString());
                int b =  Integer.parseInt(secondNum.getText().toString());
                int c = a*b;
                txtResult.setText(String.valueOf(c));
            }
        });

    }
}
