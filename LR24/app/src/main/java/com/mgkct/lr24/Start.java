package com.mgkct.lr24;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        String[] options = getResources().getStringArray(R.array.options);

        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(
                this,
                R.layout.list_item, R.id.list_item_text, options);

        ListView listObject = findViewById(R.id.list_object);
        listObject.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Start.this, AdapterTemplate.class);
                intent.putExtra("type_id", position);
                startActivity(intent);
            }
        };
        listObject.setOnItemClickListener(itemClickListener);
    }
}
