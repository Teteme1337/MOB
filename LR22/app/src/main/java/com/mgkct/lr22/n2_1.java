package com.mgkct.lr22;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class n2_1 extends AppCompatActivity {

    private ImageView indicator;
    private ToggleButton toggleButton;
    private CheckBox checkboxMilk, checkboxCream, checkboxSugar, checkboxSyrup;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.n2_1);

        indicator = findViewById(R.id.indicator);
        toggleButton = findViewById(R.id.toggle_button);
        checkboxMilk = findViewById(R.id.checkbox_milk);
        checkboxCream = findViewById(R.id.checkbox_cream);
        checkboxSugar = findViewById(R.id.checkbox_sugar);
        checkboxSyrup = findViewById(R.id.checkbox_syrup);
        spinner = findViewById(R.id.spinner);
    }

    public void onToggleButtonClicked(View view) {
        boolean on = ((ToggleButton) view).isChecked();
        if (on) {
            indicator.setImageResource(R.drawable.hot);
        } else {
            indicator.setImageResource(R.drawable.cold);
        }
    }

    public void onButtonClicked(View view) {
        boolean isHot = toggleButton.isChecked();

        boolean hasMilk = checkboxMilk.isChecked();
        boolean hasCream = checkboxCream.isChecked();
        boolean hasSugar = checkboxSugar.isChecked();
        boolean hasSyrup = checkboxSyrup.isChecked();

        String additive;

        if (hasMilk || hasCream || hasSugar || hasSyrup) {
            additive = (hasMilk ? "молоко " : "") +
                    (hasCream ? "сливки " : "") +
                    (hasSugar ? "сахар " : "") +
                    (hasSyrup ? "сироп" : "");
        } else {
            additive = "нету";
        }

        String selectedDrinkType = spinner.getSelectedItem().toString();

        String message = "Температура напитка: " + (isHot ? "Горячий" : "Холодный") + "\n" +
                "Добавки: " + additive+ "\n" +
                "Тип получения: " + selectedDrinkType;

        Intent intent = new Intent(this, n2_2.class);
        intent.putExtra("EXTRA_MESSAGE", message);
        startActivity(intent);
    }
}
