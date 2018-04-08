package com.example.sayed.navigationdroiarpractice;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import java.util.Objects;

public class NavigationActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    android.support.v7.widget.Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drower);


        toolbar = findViewById(R.id.toolbarNVClassID);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.open_drawer, R.string.close_drawer);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.nv_menu_InboxMenuId:
                break;
            case R.id.nv_menu_StarredMenuId:
                break;
            case R.id.nv_menu_SentMenuId:
                break;
            case R.id.nv_menu_DraftMenuId:
                break;
            case R.id.nv_menu_allEmailId:
                break;
            case R.id.nv_menu_trash_id:
                break;
            case R.id.nv_menu_spam_Id:
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }
}
