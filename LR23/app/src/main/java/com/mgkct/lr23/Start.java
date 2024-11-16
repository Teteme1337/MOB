package com.mgkct.lr23;


import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
    }

    public void onButtonClick(View view) {
        Intent intent = new Intent(Start.this, N1.class);
        startActivity(intent);
    }

    public void onButton2Click(View view) {
        Intent intent = new Intent(Start.this, N2.class);
        startActivity(intent);
    }
}
