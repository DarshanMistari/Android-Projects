package com.darshan.addition;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AdditionActivity extends AppCompatActivity {
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addition_layout);

        EditText edtNum1 = findViewById(R.id.edtNum1);
        EditText edtNum2 = findViewById(R.id.edtNum2);
        Button btnAdd = findViewById(R.id.btnAdd);
        TextView txtResult = findViewById(R.id.txtResult);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edtNum1.getText().toString());
                int b = Integer.parseInt(edtNum2.getText().toString());
                int c = a + b;
                txtResult.setText(String.valueOf("Addition is :"+c));
            }
        });



    }
}
