package com.darshan.call_dialer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Call_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_layout);
//        EditText txtMobileNo = findViewById(R.id.txtMobileNo);
//        Button btnCall = findViewById(R.id.btnCall);
//
//        btnCall.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent iCall = new Intent(Intent.ACTION_CALL);
//                iCall.setData(Uri.parse("tel:"+txtMobileNo.getText().toString()));
//                startActivity(iCall);
//            }
//        });

    }

    public void Call(View view)
    {
        EditText txtMobileNo = findViewById(R.id.txtMobileNo);
        Intent iCall = new Intent(Intent.ACTION_CALL);
        iCall.setData(Uri.parse("tel :"+txtMobileNo.getText().toString()));
        startActivity(iCall);
    }
}
