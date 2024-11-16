package com.mgkct.lr22;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class n1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.n1);

        Intent intent = getIntent();
        int fragmentId = intent.getIntExtra("fragment_id", 1);

        int layoutResId = 0;
        switch (fragmentId) {
            case 0:
                layoutResId = R.layout.n1_1;
                break;
            case 1:
                layoutResId = R.layout.n1_2;
                break;
            case 2:
                layoutResId = R.layout.n1_3;
                break;
        }

        DynamicFragment fragment = DynamicFragment.newInstance(layoutResId);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }
}
