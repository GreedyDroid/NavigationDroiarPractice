package com.example.sayed.navigationdroiarpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbarID);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.itemOne){
            Toast.makeText(this, "Item One Selected", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.itemTwo){
            Toast.makeText(this, "Item Two Selected", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.itemThree){
            Toast.makeText(this, "Item Three Selected", Toast.LENGTH_SHORT).show();
        }else if (id== R.id.searchMenu){
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.chartMenu){
            Toast.makeText(this, "Cart", Toast.LENGTH_SHORT).show();
        }else if (id == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void goToNavigationDRActivity(View view) {
        startActivity(new Intent(MainActivity.this, Main2Activity.class));
    }
}
