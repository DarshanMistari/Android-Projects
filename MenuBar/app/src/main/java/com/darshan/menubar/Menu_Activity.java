package com.darshan.menubar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Menu_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_items,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.txtHome)
        {
            Toast.makeText(this, "Home is selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.txtAbout) {
            Toast.makeText(this, "About is selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.txtProduct) {
            Toast.makeText(this, "Product is selected", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.txtReviews)
        {
            Toast.makeText(this, "Review is selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.txtAddCard) {
            Toast.makeText(this, "AddCard is selected", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
