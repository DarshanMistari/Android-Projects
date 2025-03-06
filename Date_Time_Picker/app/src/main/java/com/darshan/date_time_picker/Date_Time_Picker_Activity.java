package com.darshan.date_time_picker;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Date_Time_Picker_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_time_picker_layout);


    }

    public void setDate(View view)
    {
        TextView txtDate = findViewById(R.id.txtDate);

        DatePickerDialog date = new DatePickerDialog(this,new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                txtDate.setText("Date is : "+ i2+"/"+i1+"/"+i);
            }
        },2025,1,31);
        date.show();
    }

    public void  setTime(View view){
        TextView txtTime = findViewById(R.id.txtTime);
        TimePickerDialog time = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                txtTime.setText("Time : "+i+":"+i1);

            }
        },12,45,false);
        time.show();
    }
}
