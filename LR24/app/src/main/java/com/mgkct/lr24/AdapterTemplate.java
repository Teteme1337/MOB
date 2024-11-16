package com.mgkct.lr24;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AdapterTemplate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter_template);

        ArrayAdapter<ObjectClass> listAdapter = new ArrayAdapter<>(this, R.layout.list_item, new ArrayList<>());

        String type = "";

        switch (getIntent().getIntExtra("type_id", 0)) {
            case 0:
                type = "Кофе";
                break;
            case 1:
                type = "Пирожные";
                break;
            case 2:
                type = "Кофейни";
                break;
        }

        TextView title =  findViewById(R.id.title);
        title.setText(type);

        for (int i = 0; i < ObjectClass.objects.length; i++) {
            if (ObjectClass.objects[i].getType().equals(type)) {
                listAdapter.add(ObjectClass.objects[i]);
            }
        }

        ListView listObject = findViewById(R.id.list_object);
        listObject.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listDrinks, View itemView, int position, long id) {
                Intent intent = new Intent(AdapterTemplate.this, ObjectTemplate.class);
                intent.putExtra("id", listAdapter.getItem(position).getId());
                startActivity(intent);
            }
        };
        listObject.setOnItemClickListener(itemClickListener);
    }
}