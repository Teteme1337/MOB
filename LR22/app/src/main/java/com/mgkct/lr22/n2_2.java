package com.mgkct.lr22;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class n2_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.n2_2);

        String message = getIntent().getStringExtra("EXTRA_MESSAGE");

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}