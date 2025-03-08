package com.darshan.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Info_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_layout);

        TextView txtUsername = findViewById(R.id.txtUsername);
        TextView txtMobileNo = findViewById(R.id.txtMobileNo);

        Bundle b  = getIntent().getExtras();
        txtUsername.setText(b.get("Username").toString());
        txtMobileNo.setText(b.get("MobileNo").toString());
    }
}
