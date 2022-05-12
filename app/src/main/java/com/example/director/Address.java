package com.example.director;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Address extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
    }

    public void addressOk(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        Toast.makeText(this, "Адрес сохранён", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void addressBack(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}