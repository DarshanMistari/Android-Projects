package com.darshan.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Division_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.division_layout);

        EditText firstNum = findViewById(R.id.firstNum);
        EditText secondNum = findViewById(R.id.secondNum);
        Button btnDiv = findViewById(R.id.btnDiv);
        TextView txtResult = findViewById(R.id.txtResult);

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = Integer.parseInt(firstNum.getText().toString());
                int b = Integer.parseInt(secondNum.getText().toString());
                int c = a/b;
                txtResult.setText(String.valueOf(c));
            }
        });
    }
}
