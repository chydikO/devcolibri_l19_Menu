package com.chudnovskiy.devcolibri_l19_menu;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_settings: {
                Toast.makeText(getApplicationContext(), "Menu Settings", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.menu_help: {
                Toast.makeText(getApplicationContext(), "Menu Help", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.menu_about: {
                Toast.makeText(getApplicationContext(), "Menu About", Toast.LENGTH_LONG).show();
                break;
            }

        }
        return super.onOptionsItemSelected(item);
    }
}