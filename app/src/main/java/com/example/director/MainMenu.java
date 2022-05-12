package com.example.director;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainMenu extends AppCompatActivity {

    public EditText editText;
    ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        editText = (EditText) findViewById(R.id.search);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        recyclerView.addItemDecoration(new ItemDecoration(15));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        MenuItemAdapter adapter = new MenuItemAdapter(this, menuItems);
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){
        menuItems.add(new MenuItem ("Veggie tomato mix", 1200, R.drawable.dish_default_icon));
        menuItems.add(new MenuItem ("Egg and cucmber...", 1200, R.drawable.dish_default_icon));
        menuItems.add(new MenuItem ("Veggie tomato mix", 1200, R.drawable.dish_default_icon));
        menuItems.add(new MenuItem ("Egg and cucmber...", 1200, R.drawable.dish_default_icon));
        menuItems.add(new MenuItem ("Veggie tomato mix", 1200, R.drawable.dish_default_icon));
        menuItems.add(new MenuItem ("Veggie tomato mix", 1200, R.drawable.dish_default_icon));
    }

    public void search(View view) {
        findViewById(R.id.search).setVisibility(View.VISIBLE);
        findViewById(R.id.address).setVisibility(View.INVISIBLE);
        findViewById(R.id.addressStr).setVisibility(View.INVISIBLE);
        findViewById(R.id.krest).setVisibility(View.VISIBLE);
    }

    public void clear(View view) {
        findViewById(R.id.search).setVisibility(View.INVISIBLE);
        findViewById(R.id.address).setVisibility(View.VISIBLE);
        findViewById(R.id.addressStr).setVisibility(View.VISIBLE);
        findViewById(R.id.krest).setVisibility(View.INVISIBLE);
        editText.getText().clear();
    }

    public void address(View view) {
        Intent intent = new Intent(this, Address.class);
        startActivity(intent);
    }

    public void addressStr(View view) {
        Intent intent = new Intent(this, Address.class);
        startActivity(intent);
    }

    public void food(View view) {
        findViewById(R.id.foodbar).setVisibility(View.VISIBLE);
        findViewById(R.id.drinkbar).setVisibility(View.INVISIBLE);
        findViewById(R.id.snackbar).setVisibility(View.INVISIBLE);
        findViewById(R.id.saucebar).setVisibility(View.INVISIBLE);
    }

    public void drink(View view) {
        findViewById(R.id.foodbar).setVisibility(View.INVISIBLE);
        findViewById(R.id.drinkbar).setVisibility(View.VISIBLE);
        findViewById(R.id.snackbar).setVisibility(View.INVISIBLE);
        findViewById(R.id.saucebar).setVisibility(View.INVISIBLE);
    }

    public void snack(View view) {
        findViewById(R.id.foodbar).setVisibility(View.INVISIBLE);
        findViewById(R.id.drinkbar).setVisibility(View.INVISIBLE);
        findViewById(R.id.snackbar).setVisibility(View.VISIBLE);
        findViewById(R.id.saucebar).setVisibility(View.INVISIBLE);
    }

    public void sauce(View view) {
        findViewById(R.id.foodbar).setVisibility(View.INVISIBLE);
        findViewById(R.id.drinkbar).setVisibility(View.INVISIBLE);
        findViewById(R.id.snackbar).setVisibility(View.INVISIBLE);
        findViewById(R.id.saucebar).setVisibility(View.VISIBLE);
    }
}