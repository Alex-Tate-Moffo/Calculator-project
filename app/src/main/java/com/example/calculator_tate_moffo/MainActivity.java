package com.example.calculator_tate_moffo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // declare global variables
    private Button button_C;
    private Button button_CE;
    private Button button_sign;
    private Button button_divide;

    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_add;

    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_subtract;

    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_multiply;

    private Button button_0;
    private Button button_decimal;
    private Button button_equals;

    private TextView result;

    // ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // gets the display text
        result = findViewById(R.id.TextView_MathResult);

        // ...

        // handles the C button
        button_C = findViewById(R.id.button_C);
        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // handles the CE button
        button_CE = findViewById(R.id.button_CE);
        button_CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // handles the +/- button
        button_sign = findViewById(R.id.button_sign);
        button_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // handles the ÷ button
        button_divide = findViewById(R.id.button_divide);
        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // ...

        // handles the 7 button
        button_7 = findViewById(R.id.button_7);
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // handles the 8 button
        button_8 = findViewById(R.id.button_8);
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // handles the 9 button
        button_9 = findViewById(R.id.button_9);
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // handles the add button
        button_add = findViewById(R.id.button_add);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // ...

        // handles the 4 button
        button_4 = findViewById(R.id.button_4);
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // handles the 5 button
        button_5 = findViewById(R.id.button_5);
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // handles the 6 button
        button_6 = findViewById(R.id.button_6);
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // handles the - button
        button_subtract = findViewById(R.id.button_subtract);
        button_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // ...

        // handles the 1 button
        button_1 = findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // handles the 2 button
        button_2 = findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // handles the 3 button
        button_3 = findViewById(R.id.button_3);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // handles the * button
        button_multiply = findViewById(R.id.button_multiply);
        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // ...

        // handles the 0 button
        button_0 = findViewById(R.id.button_0);
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // handles the . button
        button_decimal = findViewById(R.id.button_decimal);
        button_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // handles the = button
        button_equals = findViewById(R.id.button_equals);
        button_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}