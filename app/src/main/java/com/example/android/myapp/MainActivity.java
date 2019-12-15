package com.example.android.myapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kategori(View view) {
        Intent kategori= new Intent(MainActivity.this, Kategori.class);
        startActivity(kategori);
    }

    public void add(View view) {
        Intent add= new Intent(MainActivity.this, Add.class);
        startActivity(add);
    }

    public void buka(View view) {
        Uri uri = Uri.parse("http://instagram.com/_u/mardianaa24");
        Intent bukaig = new Intent(Intent.ACTION_VIEW, uri);
        bukaig.setPackage("com.instagram.android");

        try {
            startActivity(bukaig);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/mardianaa24")));
        }
    }

    public void TentangAplikasi(View view) {
        Intent TentangAplikasi= new Intent(MainActivity.this, TentangAplikasi.class);
        startActivity(TentangAplikasi);
    }
}
