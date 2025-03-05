package com.darshan.email_message;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Email_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_layout);

        EditText txtTo = findViewById(R.id.txtTo);
        EditText txtSubject = findViewById(R.id.txtSubject);
        EditText txtMsg = findViewById(R.id.txtMsg);
        Button btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL,new String[]{txtTo.getText().toString()});
                i.putExtra(Intent.EXTRA_SUBJECT,txtSubject.getText().toString());
                i.putExtra(Intent.EXTRA_TEXT,txtMsg.getText().toString());
                startActivity(Intent.createChooser(i,"Send My Email Using"));
            }
        });



    }
}
