package com.example.exercise_week8;

import static java.lang.Integer.parseInt;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText inputFirstNumber;
    private EditText inputSecondNumber;
    private TextView resultOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputFirstNumber = findViewById(R.id.inputFirstNumber);
        inputSecondNumber = findViewById(R.id.inputSecondNumber);
        resultOutput = findViewById(R.id.resultOutput);
    }

    public void plus(View view) {
       int result =  parseInt(inputFirstNumber.getText().toString())+ parseInt(inputSecondNumber.getText().toString());
        resultOutput.setText(String.valueOf(result));
        System.out.println(result);
    }

    public void minus(View view){
        int result = parseInt(inputFirstNumber.getText().toString()) - parseInt(inputSecondNumber.getText().toString());
        resultOutput.setText(String.valueOf(result));
        System.out.println(result);
    }

    public void multiply(View view){
        int result = parseInt(inputFirstNumber.getText().toString()) * parseInt(inputSecondNumber.getText().toString());
        resultOutput.setText(String.valueOf(result));
        System.out.println(result);
    }
    public void divide(View view){
        try {
            int result = parseInt(inputFirstNumber.getText().toString()) / parseInt(inputSecondNumber.getText().toString());
            resultOutput.setText(String.valueOf(result));
            System.out.println(result);
        } catch (ArithmeticException e) {
            resultOutput.setText("Math ERROR");
        }

    }
}