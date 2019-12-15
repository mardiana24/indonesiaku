package com.example.android.myapp;

       import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Add extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public void Kirim(View view) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        EditText judulField = (EditText) findViewById(R.id.judul_field);
        String judul = judulField.getText().toString();


        EditText isiField = (EditText) findViewById(R.id.isi_field);
        String isi = isiField.getText().toString();

        String summary = judul + "\n\n" + isi;

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:mardiana24399@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Berita baru dari: " + name);
        intent.putExtra(Intent.EXTRA_TEXT, "Judul: " + summary);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    @Override
    public void onClick(View view) {

    }
}
