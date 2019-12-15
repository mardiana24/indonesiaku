package com.example.android.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Kategori extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }



    public void business(View view) {
        Intent business = new Intent(Kategori.this, Business.class);
        startActivity(business);
    }

    public void entertainment(View view) {
        Intent entertainment = new Intent(Kategori.this, Entertainment.class);
        startActivity(entertainment);
    }

    public void health(View view) {
        Intent health = new Intent(Kategori.this, Health.class);
        startActivity(health);
    }

    public void science(View view) {
        Intent science = new Intent(Kategori.this, Science.class);
        startActivity(science);
    }

    public void sports(View view) {
        Intent sports = new Intent(Kategori.this, Sports.class);
        startActivity(sports);
    }

    public void technology(View view) {
        Intent technology = new Intent(Kategori.this, Technology.class);
        startActivity(technology);
    }
}
