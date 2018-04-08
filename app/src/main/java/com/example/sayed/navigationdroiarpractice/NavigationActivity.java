package com.example.sayed.navigationdroiarpractice;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

import java.util.Objects;

public class NavigationActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
//    android.support.v7.widget.Toolbar toolbar
//    DrawerLayout drawerLayout;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drower);


        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbarTwo);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigation_view);

//        navigationView.setNavigationItemSelectedListener(this);

/*        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.open_drawer, R.string.close_drawer);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /* @Override
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
        }*/
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nv_menu_InboxMenuId) {
            // Handle the camera action
        } else if (id == R.id.nv_menu_StarredMenuId) {

        } else if (id == R.id.nv_menu_SentMenuId) {

        } else if (id == R.id.nv_menu_DraftMenuId) {

        } else if (id == R.id.nv_menu_allEmailId) {

        } else if (id == R.id.nv_menu_trash_id) {

        }else if (id == R.id.nv_menu_spam_Id) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
