package com.example.listbulyginja;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    String[] country = {"Аргентина","Бразилия","Чили","Колумбия"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, country);
        setListAdapter(adapter);
        AdapterView.OnItemClickListener itemClick = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(MainActivity.this,Argentina.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this,Brazil.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this,Cili.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this,Columbia.class);
                        startActivity(intent3);
                        break;
                }
                Toast.makeText(getApplicationContext(),"Вы выбрали "
                        +parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }
        };
        getListView().setOnItemClickListener(itemClick);
    }
}