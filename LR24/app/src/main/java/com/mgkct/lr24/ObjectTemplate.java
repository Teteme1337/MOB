package com.mgkct.lr24;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ObjectTemplate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_template);

        int id = getIntent().getIntExtra("id", 0);

        ImageView photo = findViewById(R.id.photo);
        TextView name = findViewById(R.id.name);
        TextView description =  findViewById(R.id.description);

        photo.setImageResource(ObjectClass.objects[id].getImageResourceId());
        name.setText(ObjectClass.objects[id].getName());
        description.setText(ObjectClass.objects[id].getDescription());
    }
}