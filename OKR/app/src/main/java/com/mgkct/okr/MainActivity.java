package com.mgkct.okr;

import android.os.Bundle;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получение элементов из макета
        EditText inputA = findViewById(R.id.input_a);
        EditText inputB = findViewById(R.id.input_b);
        EditText inputAlpha = findViewById(R.id.input_alpha);
        Button btnCalculate = findViewById(R.id.btn_calculate);
        TextView result = findViewById(R.id.result);

        // Обработчик нажатия кнопки
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // Получение данных из полей ввода
                    double a = Double.parseDouble(inputA.getText().toString());
                    double b = Double.parseDouble(inputB.getText().toString());
                    double alpha = Double.parseDouble(inputAlpha.getText().toString());

                    // Проверка условий
                    if (alpha <=0 || alpha > 90) {
                        showWarningToast("Угол α должен быть в диапазоне (0, 90] градусов!");
                        return;
                    }

                    // Преобразование угла в радианы
                    double alphaRadians = Math.toRadians(alpha);

                    // Вычисление площади
                    double s = a * b * Math.sin(alphaRadians);

                    // Отображение результата
                    result.setText(String.format("Результат: %.3f", s));

                } catch (NumberFormatException e) {
                    showErrorToast("Пожалуйста, введите корректные числа!");
                }
            }
        });
    }

    // Метод для отображения ошибок (красное уведомление)
    private void showErrorToast(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);

        // Изменение стиля уведомления
        View view = toast.getView();
        if (view != null) { // Проверка на null
            GradientDrawable background = new GradientDrawable();
            background.setColor(Color.parseColor("#FFCDD2")); // Красный цвет
            background.setCornerRadius(16);
            view.setBackground(background);

            TextView text = view.findViewById(android.R.id.message);
            text.setTextColor(Color.BLACK);
            text.setTextSize(16);
            text.setGravity(Gravity.CENTER);

            toast.setGravity(Gravity.BOTTOM, 0, 150);
            toast.show();
        } else {
            // В случае ошибки вызова представления, покажем стандартный Toast
            toast.show();
        }
    }

    // Метод для отображения предупреждений (желтое уведомление)
    private void showWarningToast(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);

        // Изменение стиля уведомления
        View view = toast.getView();
        if (view != null) { // Проверка на null
            GradientDrawable background = new GradientDrawable();
            background.setColor(Color.parseColor("#FFF9C4")); // Желтый цвет
            background.setCornerRadius(16);
            view.setBackground(background);

            TextView text = view.findViewById(android.R.id.message);
            text.setTextColor(Color.BLACK);
            text.setTextSize(16);
            text.setGravity(Gravity.CENTER);

            toast.setGravity(Gravity.BOTTOM, 0, 150);
            toast.show();
        } else {
            // В случае ошибки вызова представления, покажем стандартный Toast
            toast.show();
        }
    }
}
