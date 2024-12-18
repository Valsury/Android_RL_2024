package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<String> productList;
    private ArrayList<Integer> productQuantities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = findViewById(R.id.listView);


        productList = new ArrayList<>();
        productList.add("Яблоки");
        productList.add("Бананы");
        productList.add("Молоко");
        productList.add("Хлеб");
        productList.add("Масло");


        productQuantities = new ArrayList<>();
        productQuantities.add(10);
        productQuantities.add(15);
        productQuantities.add(5);
        productQuantities.add(20);
        productQuantities.add(8);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, productList);


        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int quantity = productQuantities.get(position);

                Toast.makeText(MainActivity.this,
                        "Количество: " + quantity, Toast.LENGTH_SHORT).show();
            }
        });
    }
}