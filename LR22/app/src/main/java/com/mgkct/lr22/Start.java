package com.mgkct.lr22;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Start extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        Button[] buttons = {  findViewById(R.id.button),
                            findViewById(R.id.button2),
                            findViewById(R.id.button3),
                            findViewById(R.id.button4)};

        for (int i = 0; i < buttons.length; i++) {
            final int index = i;
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (index != 3) {
                        Intent intent = new Intent(Start.this, n1.class);
                        intent.putExtra("fragment_id", index);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(Start.this, n2_1.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}